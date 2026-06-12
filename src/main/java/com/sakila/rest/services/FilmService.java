package com.sakila.rest.services;

import com.sakila.rest.entities.Film;

import java.util.List;

public interface FilmService extends IService<Film, Integer> {
    List<Film> findAllFilms();
    List<Film> searchFilmsByTitle(String searchTerm);
    Film getFilmWithActors(Integer filmId);
    List<Film> findFilmsByActorId(Integer actorId);
}
