package com.akinnova.hospitalManagement.exception;

public class ApiException extends RuntimeException{
    public ApiException(String message) {
        super(message);
    }
}
