package com.ethiopia.flightbooking.repository;

import com.ethiopia.flightbooking.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight,Integer>
{
}
