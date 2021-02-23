package com.example.mysecondassignment;

import com.example.javabasics.MyClass;
import com.example.mysecondassignment.CheatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    public static  String SHOW_ANSWER;
    private TextView QuestionText;

    private Button TrueButton, FalseButton, CheatButton;

    private ImageButton PrevImageButton, NextImageButton;

    private int CurrentIndex;

    private boolean Cheat;

    private static final String KEY_INDEX = "index";

   // private static final String SHOW_ANSWER = "Answer";


    private MyClass[] QuestionBank = new MyClass[]
            {

                    new MyClass(R.string.question_an, false),

                    new MyClass(R.string.question_ch, true),

                    new MyClass(R.string.question_su, false),

                    new MyClass(R.string.question_tai, true),

                    new MyClass(R.string.question_zhu, true),

                    new MyClass(R.string.question_ya, true),


            };


    protected void onActivityResult(int requestCode, int resultCode, intent data) {
        if (data == null) {
            return;
        } else {
            Cheat = data.getBooleanExtra(CheatActivity.ANSWER_SHOWN, false);
        }
    }


    public void UpdateQuestion() {
        CurrentIndex = (CurrentIndex + 1) % QuestionBank.length;
        Cheat = false;
        QuestionText.setText(QuestionBank[CurrentIndex].getQuestions());
    }


    public void CheckAnswer(boolean b) {
        boolean Answer = QuestionBank[CurrentIndex].isAnswer();

        if (Cheat) {
            if (Answer == b) {
                Toast.makeText(MainActivity.this, "Your Answer Is Correct!", Toast.LENGTH_SHORT).show();
            } else {

                Toast.makeText(MainActivity.this, "Sorry, Your Anser is Incorrect!", Toast.LENGTH_SHORT).show();
            }
        } else if (Answer == b) {
            Toast.makeText(MainActivity.this, "Congrats,Your Answer Is Correct!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Sorry, Your Anser is Incorrect!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null)
            CurrentIndex = savedInstanceState.getInt(KEY_INDEX);

        QuestionText = (TextView) findViewById(R.id.question_text_id);

        QuestionText.setText(QuestionBank[CurrentIndex].getQuestions());

        TrueButton = (Button) findViewById(R.id.true_button_id);

        TrueButton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                CheckAnswer(true);
            }

        });

        FalseButton = (Button) findViewById(R.id.false_button_id);

        FalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckAnswer(false);
            }
        });

        CheatButton = (Button) findViewById(R.id.cheat_button_id);

        CheatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CheatActivity.this);

                boolean isTrue = QuestionBank[CurrentIndex].isAnswer();
                i.putExtra(SHOW_ANSWER, isTrue);

                startActivityForResult(i, 0);

            }
        });

        PrevImageButton = (ImageButton) findViewById(R.id.prev_image_id);

        PrevImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CurrentIndex == 0) {
                    CurrentIndex = QuestionBank.length;

                }

                CurrentIndex--;
                QuestionText.setText(QuestionBank[CurrentIndex].getQuestions());

            }
        });

        NextImageButton = (ImageButton) findViewById(R.id.next_image_id);

        NextImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UpdateQuestion();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onSaveInstanceState(Bundle saveInstanceState)
    {
        super.onSaveInstanceState(saveInstanceState);
        saveInstanceState.putInt(KEY_INDEX,CurrentIndex);
    }

}