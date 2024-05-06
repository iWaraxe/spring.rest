package com.coherentsolutions.spring.rest.exceptions;

public class EmployeeIncorrectData {
    private String message;

    public EmployeeIncorrectData() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
