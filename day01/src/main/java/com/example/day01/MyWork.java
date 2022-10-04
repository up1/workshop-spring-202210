package com.example.day01;

public class MyWork {

    private final String input;

    public MyWork(String input) {
        this.input = input;
    }

    public boolean isStartWithInclude() {
        return input.startsWith("[");
    }

    public int getStartNumber() {
        if(isStartWithInclude())
            return input.charAt(1) - 48;
        return input.charAt(1) - 47;
    }

    public String getResult() {
        int s = getStartNumber();
        int e = 5;
        String result = "";
        for (int i = s; i <= e ; i++) {
            result += i;
        }
        return result;
    }
}
