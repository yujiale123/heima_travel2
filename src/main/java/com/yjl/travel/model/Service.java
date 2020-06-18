package com.yjl.travel.model;


public class Service {
    private int serid;
    private String question;
    private String answer;

    public Service() {
    }

    public Service(int serid, String question, String answer) {
        this.serid = serid;
        this.question = question;
        this.answer = answer;
    }

    public int getSerid() {
        return serid;
    }

    public void setSerid(int serid) {
        this.serid = serid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
