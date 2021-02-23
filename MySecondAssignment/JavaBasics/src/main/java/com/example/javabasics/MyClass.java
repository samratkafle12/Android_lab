package com.example.javabasics;

public class MyClass {

    private int Questions;

    private boolean TrueQuestions;

    public MyClass(int Questions, boolean TrueQuestions)
    {
        super();
        this.Questions = Questions;
        this.TrueQuestions = TrueQuestions;
    }

    public int getQuestions()
    {
        return Questions;
    }

    public void setQuestions(int Questions)
    {
        this.Questions = Questions;
    }

    public boolean getTrueQuestions()
    {
        return TrueQuestions;
    }

    public void setTrueQuestions()
    {
        this.TrueQuestions = TrueQuestions;
    }


}