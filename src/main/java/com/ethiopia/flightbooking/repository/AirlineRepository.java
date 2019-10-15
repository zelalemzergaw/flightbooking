package com.ethiopia.flightbooking.repository;

import com.ethiopia.flightbooking.model.Airline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirlineRepository extends JpaRepository<Airline,Integer>
{
}
