package com.imanage.test.ExceptionController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.EmptyStackException;

@ControllerAdvice
public class StackExceptionHandler {
    @ExceptionHandler(value = EmptyStackException.class)
    public ResponseEntity<Object> exception(EmptyStackException e) {
        return new ResponseEntity<>("STACK is Empty ", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = {ArrayIndexOutOfBoundsException.class,IllegalArgumentException.class})
    public ResponseEntity<Object> exception(ArrayIndexOutOfBoundsException e) {
        return new ResponseEntity<>("Invalid Operation :: "+e.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
    }
}
