package com.example.projectx.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@RestControllerAdvice
public class FresherExceptionHandler {
    @ExceptionHandler(value = {RequestException.class})
    public ResponseEntity<Object> handleRequestException(RequestException e) {
        //1. Create payload containing exception details
        HttpStatus badRequest = HttpStatus.BAD_REQUEST;
        Exception exception = new Exception(
                e.getMessage(),
                badRequest,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        //2. Return response entity
        return new ResponseEntity<>(exception, badRequest);

    }
}
