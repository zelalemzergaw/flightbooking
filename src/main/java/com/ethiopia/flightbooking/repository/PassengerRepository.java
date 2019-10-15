package com.ethiopia.flightbooking.repository;

import com.ethiopia.flightbooking.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger,Integer>
{
}

