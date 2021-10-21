package com.stringapi.api;

public class StringCount {
    private int uppercase;
    private int lowercase;
    private int special;
    private int number;

    public StringCount(int uppercase, int lowercase, int special, int number) {
        this.uppercase = uppercase;
        this.lowercase = lowercase;
        this.special = special;
        this.number = number;
    }

    public int getUppercase() {
        return uppercase;
    }

    public int getLowercase() {
        return lowercase;
    }

    public int getSpecial() {
        return special;
    }

    public int getNumber() {
        return number;
    }
}
