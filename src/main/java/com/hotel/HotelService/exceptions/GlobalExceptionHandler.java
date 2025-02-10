package com.hotel.HotelService.exceptions;

import com.hotel.HotelService.payload.ApiResponse1;
import com.hotel.HotelService.payload.ApiResponse1;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse1> handleResourceNotFoundException(ResourceNotFoundException ex){
        String message = ex.getMessage();
        ApiResponse1 response1 = ApiResponse1.builder().message(message).success(false).httpStatus(HttpStatus.NOT_FOUND).build();
//        Map<String,Object> response1 = new HashMap<>();
//        response1.put("message",message);
//        response1.put("status",false);
//        response1.put("HttpStatus",HttpStatus.NOT_FOUND);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response1);
    }
}
