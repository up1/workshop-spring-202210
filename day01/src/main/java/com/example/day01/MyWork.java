package com.example.day01;

public class MyWork {

    private final String input;

    public MyWork(String input) {
        this.input = input;
    }

    public boolean isStartWithInclude() {
        return input.startsWith("[");
    }
}
