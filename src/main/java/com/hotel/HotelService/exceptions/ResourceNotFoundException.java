package com.hotel.HotelService.exceptions;

import org.springframework.web.bind.annotation.RestControllerAdvice;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(){
        super("Hotel not present by searched id");
    }

    public ResourceNotFoundException(String message){
        super(message);
    }
}
