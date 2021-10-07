package com.summative1.Summative1AssessmentOforiAlbert.models;

public class Quote {
    private final int id;
    private final String quote;
    private final String author;

    public Quote(int id, String author, String quote) {
        this.id = id;
        this.quote = quote;
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }
}
