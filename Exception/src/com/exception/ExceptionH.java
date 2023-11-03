package com.exception;

 class CustomException extends Exception {

    private String message;

    public CustomException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}

public class ExceptionH {

    public static void main(String[] args) {
        try {
            // Code that might throw an exception
            throw new CustomException("This is a custom exception");
        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
