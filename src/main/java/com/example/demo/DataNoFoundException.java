package com.example.demo; 

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "entity not found")
public class DataNoFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public DataNoFoundException(String message) {
        super(message);
    }
}