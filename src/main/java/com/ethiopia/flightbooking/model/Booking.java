package com.ethiopia.flightbooking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bookings")
public class Booking
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "confirmationcode")
    private String confirmationCode;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    private Flight departingFlight;

    @OneToOne(cascade = CascadeType.ALL)
    private Flight returningFlight;

    @Column(name = "dateandtimeofbooking")
    private LocalDateTime dateAndTimeOfBooking;

    @Column(name = "flightclass")
    private FlightClass flightClass;

    @Column(name = "adult")
    private int adult;
    @Column(name = "children")
    private int children;


}
