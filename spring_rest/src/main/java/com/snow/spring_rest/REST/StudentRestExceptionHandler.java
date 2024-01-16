package com.snow.spring_rest.REST;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc){
        StudentErrorResponse error = new StudentErrorResponse();
        error.setStatusCode(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> badRequestHandler(Exception exc){
        StudentErrorResponse error= new StudentErrorResponse();
        error.setTimeStamp(System.currentTimeMillis());
        error.setMessage(exc.getMessage());
        error.setStatusCode(HttpStatus.BAD_REQUEST.value());
        return  new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
    }

}
