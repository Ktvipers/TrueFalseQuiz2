package com.example.per6.truefalsequiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button trueButton, falseButton, nextButton;
    private TextView questionText;
    private List<Question> questionBank;
    private int questionNumber = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wirewidgets();
        initQuestionBank();
        setListeners();
        questionBank.get(0).getQuestionText();
    }

    private void setListeners() {
    }

    public void initQuestionBank(){
        questionBank = new ArrayList<>();
        questionBank.add(new Question(getString(R.string.Poop), true));
        questionBank.add(new Question(getString(R.string.Dogs), false));
        questionBank.add(new Question(getString(R.string.Water), true));
        questionBank.add(new Question(getString(R.string.Ice_cream), false));
    }

    private void wirewidgets() {
        questionText = (TextView) findViewById(R.id.text_question);
        trueButton = (Button) findViewById(R.id.button_true);
        falseButton = (Button) findViewById(R.id.button_false);
        nextButton = (Button) findViewById(R.id.button_next);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button_next:
                advanceToNextQuestion();
                break;
            case R.id.button_true:
                checkAnswer(true);
                break;
            case R.id.button_false:
                checkAnswer(false);
                break;


        }
    }

    private void checkAnswer(boolean b) {


    }

    private void advanceToNextQuestion() {
        if(questionNumber > questionBank.size()){
        questionText.setText(questionBank.get(1).getQuestionText());
    }
        else{
            questionNumber++;
        }
    }
}
