package com.example.mysecondassignment;

import com.example.mysecondassignment.MainActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheatActivity extends Activity {
private Button Show_Answer_button;
private TextView Show_Answer_text;

private boolean AnsewrisTrue;


public  static final String ANSWER_SHOWN = "answer_shown";
    private boolean AnserisTrue;

    private void setAnswerShownResult(boolean isAnswerShown)
{
    Intent data = new Intent();

    data.putExtra(ANSWER_SHOWN,isAnswerShown);
    setResult(RESULT_OK,data);

}

@Override
protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_cheat);
Show_Answer_text = (TextView)findViewById(R.id.show_answer_id);

AnserisTrue = getIntent().getBooleanExtra(MainActivity.SHOW_ANSWER ,false);
Show_Answer_button = (Button)findViewById(R.id.show_answer_button_id);
setAnswerShownResult(false);


Show_Answer_button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if (AnserisTrue)
        {
            Show_Answer_text.setText(R.string.truebutton);
        }
        else {
            Show_Answer_text.setText(R.string.falsebutton);
        }
        setAnswerShownResult(true);
    }
});
}
}
