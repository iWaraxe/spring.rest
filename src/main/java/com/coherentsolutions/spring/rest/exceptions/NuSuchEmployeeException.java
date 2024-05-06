package com.coherentsolutions.spring.rest.exceptions;

public class NuSuchEmployeeException extends RuntimeException {
    public NuSuchEmployeeException(String message) {
        super(message);
    }
}
