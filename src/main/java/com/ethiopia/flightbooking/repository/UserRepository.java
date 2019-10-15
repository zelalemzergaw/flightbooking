package com.ethiopia.flightbooking.repository;

import com.ethiopia.flightbooking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>
{
}

