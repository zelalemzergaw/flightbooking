package com.ethiopia.flightbooking.repository;

import com.ethiopia.flightbooking.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Integer>
{
}
