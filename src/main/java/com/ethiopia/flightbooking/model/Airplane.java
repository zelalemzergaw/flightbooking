package com.ethiopia.flightbooking.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "airplanes")
public class Airplane
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "airplaneserialnumber")
    private String airplaneSerialNumber;

    @Column(name = "airplanemodel")
    private String airplaneModel;

    @Column(name = "firstclassseats")
    private int firstClassSeats;

    @Column(name = "businessclassseats")
    private int businessClassSeats;

    @Column(name = "economyslassseats")
    private int economyClassSeats;






}
