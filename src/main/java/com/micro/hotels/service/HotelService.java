package com.micro.hotels.service;

import com.micro.hotels.model.Hotel;

import java.util.List;

public interface HotelService{
    public Hotel createHotel(Hotel hotel);
    public Hotel findHotelById(String hotelId);
    public List<Hotel> finalAll();
}
