package com.ethiopia.flightbooking.repository;

import com.ethiopia.flightbooking.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport,Integer>
{
}
