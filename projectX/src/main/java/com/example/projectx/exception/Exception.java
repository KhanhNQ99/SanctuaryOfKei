package com.example.projectx.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class Exception {
    private final String message;
    private final HttpStatus httpstatus;
    private final ZonedDateTime timestamp;

    public Exception(String message, HttpStatus httpstatus, ZonedDateTime timestamp) {
        this.message = message;
        this.httpstatus = httpstatus;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpstatus() {
        return httpstatus;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }
}
