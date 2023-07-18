package com.micro.hotels.service.impl;

import com.micro.hotels.exceptions.ResourceNotFoundException;
import com.micro.hotels.model.Hotel;
import com.micro.hotels.repository.HotelRepository;
import com.micro.hotels.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel createHotel(Hotel hotel) {
        String id = UUID.randomUUID().toString();
        hotel.setId(id);
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel findHotelById(String hotelId) {
        return hotelRepository.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("Resource not found with given id on server : " + hotelId));
    }

    @Override
    public List<Hotel> finalAll() {
        return hotelRepository.findAll();
    }
}
