package com.sakila.rest.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "film")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    private Integer id;
    @Column(name = "title")
    private String title;
}
