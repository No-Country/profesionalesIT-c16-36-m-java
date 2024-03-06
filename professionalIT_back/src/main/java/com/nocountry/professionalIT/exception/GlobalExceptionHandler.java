package com.nocountry.professionalIT.exception;

import com.nocountry.professionalIT.dto.ApiError;
import jakarta.persistence.EntityNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<Object> handlerEntityNotFoundException(EntityNotFoundException exception,
                                                                HttpServletRequest request){

        ApiError apiError = ApiError.builder()
                .message(exception.getMessage())
                .url(request.getRequestURL().toString())
                .method(request.getMethod())
                .timeStamp(LocalDateTime.now())
                .build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(apiError);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> handlerMethodArgumentNotValidException(MethodArgumentNotValidException exception,
                                                                         HttpServletRequest request){
        ApiError apiError = ApiError.builder()
                .message(exception.getAllErrors().stream().map(each -> each.getDefaultMessage()).toList().toString())
                .url(request.getRequestURL().toString())
                .method(request.getMethod())
                .timeStamp(LocalDateTime.now())
                .build();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(apiError);
    }
}
