package com.summative1.Summative1AssessmentOforiAlbert.models;

public class Answer {
    private int id;
    private Question question;
    private String answer;

    public Answer() {
    }

    public Answer(int id, Question question, String answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }

    public Answer(int id, String answer) {
        this.id = id;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public Question getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
