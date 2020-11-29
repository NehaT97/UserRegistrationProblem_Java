package com.userregistrationvalidation.exceptions;

public class ValidationException extends IllegalArgumentException {

    private String message;
    private Throwable ex;

    public ValidationException() {
        super();
    }
    public ValidationException(String message) {
        super(message);
        this.message = message;
    }

    public ValidationException(String message, Throwable ex) {
        super(message, ex);
        this.message = message;
        this.ex = ex;
    }

}
