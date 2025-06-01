package com.ciicc.DBank.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Generated;

import java.util.Date;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String password;

    @Column(unique = true, nullable = false)
    private String email;
    private Date createdAt;


}
