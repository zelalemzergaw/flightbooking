package com.ethiopia.flightbooking.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "admins")
public class Admin
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotEmpty(message = "please provide email")
    @Email(message = "please provide a valid email")
    @Column(name = "firstname")
    private String firstName;

    @NotEmpty(message = "please provide a valid last name")
    @Column(name = "lastname")
    private String lastName;

    @Column(name = "username")
    @NotEmpty(message = "please provide a valid last name")
    private String userName;

    @Column(name = "password")
    @NotEmpty(message = "*Please provide your password")
    private String passWord;

}
