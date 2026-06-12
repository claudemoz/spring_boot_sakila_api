package com.sakila.rest.services;

import com.sakila.rest.entities.Film;
import com.sakila.rest.repositories.ActorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService{
    private final ActorRepository actorRepository;

    public ActorServiceImpl(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
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
}
