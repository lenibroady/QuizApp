package com.example.leni.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.correct1:
                if (checked)
                    score++;
//            case R.id.radio_ninjas:
//                if (checked)
//                    // Ninjas rule
//                    break;
        }
    }

    public void onCheckboxClicked(View view) {
        int right=0;
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.q2right1:
                if (checked)
                    right++;
            case R.id.q2right2:
                if (checked)
                    right++;
            case R.id.q2right3:
                if (checked)
                    right++;
        }
        if(right==3)
            score++;
    }
    public void onEditText(View view){
        boolean correct = false;
        EditText simpleEditText = (EditText) findViewById(R.id.textbox);
        String editTextValue = simpleEditText.getText().toString();
        if(editTextValue.equals("Lexington")||editTextValue.equals("lexington"))
            correct=true;
        if(correct==true)
            score++;
    }
    public void onRadioButtonClicked2(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.q4correct1:
                if (checked)
                    score++;
//            case R.id.radio_ninjas:
//                if (checked)
//                    // Ninjas rule
//                    break;
        }

    }
    private void displaypoints(){
        TextView quantityTextView = (TextView) findViewById(R.id.score);
        quantityTextView.setText("" + score);
    }
    public void submit(View view){
        displaypoints();
    }
}
