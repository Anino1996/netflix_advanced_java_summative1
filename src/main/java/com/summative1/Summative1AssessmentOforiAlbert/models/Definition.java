package com.summative1.Summative1AssessmentOforiAlbert.models;

public class Definition {
    private final int id;
    private final String word;
    private final String definition;

    public Definition(int id, String word, String definition) {
        this.id = id;
        this.word = word;
        this.definition = definition;
    }

    public int getId() {
        return id;
    }

    public String getWord() {
        return word;
    }

    public String getDefinition() {
        return definition;
    }
}
