package com.ethiopia.flightbooking.service;

import com.ethiopia.flightbooking.model.Airline;

import java.util.List;

public interface AirlineService
{

    List<Airline> findAll();
    Airline save(Airline airline);
    Airline findOne(int id);
    void delete(int id);
}
