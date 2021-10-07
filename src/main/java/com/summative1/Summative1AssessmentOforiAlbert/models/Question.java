package com.summative1.Summative1AssessmentOforiAlbert.models;

import javax.validation.constraints.NotEmpty;
import java.util.Objects;

public class Question {

    @NotEmpty(message = "Please enter a question.")
    private String text;

    public Question() {
    }

    public Question(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getText());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Question question = (Question) obj;
        return getText().equals(question.getText());
    }
}