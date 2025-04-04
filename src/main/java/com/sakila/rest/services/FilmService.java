package com.sakila.rest.services;

import com.sakila.rest.entities.Film;

import java.util.List;

public interface FilmService extends IService<Film, Integer> {
    List<Film> searchFilmByTitle(String name);
    List<Film> searchFilmByActor(String name);
}
