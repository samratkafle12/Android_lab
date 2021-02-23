package com.example.mynewapp;



import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import android.widget.RelativeLayout;
import android.widget.Button;


public class MainActivity extends Activity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout mylayout =  new RelativeLayout(this);
        Button mybutton = new Button(this);

        mylayout.addView(mybutton);

        mylayout.setBackgroundColor(Color.BLUE);

        mybutton.setBackgroundColor(Color.GREEN);

        mybutton.setText("Click here!");

        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT

        );
        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);


        mylayout.addView(mybutton,buttonDetails);

        setContentView(mylayout);
    }
}