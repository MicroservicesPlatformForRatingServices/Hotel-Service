package com.hotel.HotelService.payload;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiResponse1 {
    private String message;
    private Boolean success;
    private HttpStatus httpStatus;
}
