package com.ethiopia.flightbooking.service.impl;

import com.ethiopia.flightbooking.model.Airline;
import com.ethiopia.flightbooking.repository.AirlineRepository;
import com.ethiopia.flightbooking.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirlineServiceImpl implements AirlineService
{
    @Autowired
    public AirlineRepository airlineRepository;

    @Override
    public List<Airline> findAll() {
        return airlineRepository.findAll();
    }

    @Override
    public Airline save(Airline airline) {
        return airlineRepository.save(airline);
    }

    @Override
    public Airline findOne(int id) {
        Optional<Airline> airline=airlineRepository.findById(id);
        return airline.orElse(null);
    }

    @Override
    public void delete(int id) {
        airlineRepository.deleteById(id);

    }
}
