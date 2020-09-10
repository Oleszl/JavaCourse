package com.company;

public class WrongInputConsoleParametersException extends Exception {

    private String month;

    public String getMonth() {
        return month;
    }

    public WrongInputConsoleParametersException(String message, String month) {
        super(message);
        this.month = month;
    }
}
