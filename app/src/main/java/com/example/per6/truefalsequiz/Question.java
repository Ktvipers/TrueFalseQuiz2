package com.example.per6.truefalsequiz;

/**
 * Created by per6 on 9/15/17.
 */

public class Question {
    private String questionText;
    private boolean answer;

    public Question(String questionText, boolean answer) {
        this.questionText = questionText;
        this.answer = answer;
    }


    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public boolean isAnswer(){
        return answer;
    }

    public boolean checkAnswer(boolean userAnswer){
        return answer == userAnswer;
    }



}