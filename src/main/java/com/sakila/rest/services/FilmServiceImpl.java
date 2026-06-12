package com.sakila.rest.services;

import com.sakila.rest.entities.Film;
import com.sakila.rest.repositories.FilmRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {
    private final FilmRepository filmRepository;

    public FilmServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }


    @Override
    public Film create(Film obj) {
        return null;
    }

    @Override
    public Film read(Integer id) {
        return null;
    }

    @Override
    public Film update(Film obj) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public List<Film> readAll() {
        return null;
    }


    @Override
    @Transactional
    public List<Film> findAllFilms() {
        return filmRepository.findAll();
    }

    @Override
    @Transactional
    public List<Film> searchFilmsByTitle(String searchTerm) {
        return filmRepository.findByTitleContaining(searchTerm);
    }

    @Override
    @Transactional()
    public Film getFilmWithActors(Integer filmId) {
        return filmRepository.findFilmWithActors(filmId);
    }

    @Override
    @Transactional()
    public List<Film> findFilmsByActorId(Integer actorId) {
        return filmRepository.findFilmsByActorId(actorId);
    }
}
