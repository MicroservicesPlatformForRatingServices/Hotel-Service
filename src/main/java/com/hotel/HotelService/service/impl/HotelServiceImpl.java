package com.hotel.HotelService.service.impl;

import com.hotel.HotelService.entity.Hotel;
import com.hotel.HotelService.exceptions.ResourceNotFoundException;
import com.hotel.HotelService.repository.HotelRepository;
import com.hotel.HotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
        String generatedId = UUID.randomUUID().toString();
        hotel.setHotelId(generatedId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(String id) {
        return hotelRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }
}
