package com.sakila.rest.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "actor")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "actor_id")
    private Integer id;
    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;
}
