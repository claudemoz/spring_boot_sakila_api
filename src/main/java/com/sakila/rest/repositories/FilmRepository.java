package com.sakila.rest.repositories;

import com.sakila.rest.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer> {


    List<Film> findByTitleContaining(String title);

    @Query("SELECT f FROM Film f JOIN FETCH f.actors WHERE f.id = :filmId")
    Film findFilmWithActors(@Param("filmId") Integer filmId);

    @Query("SELECT f FROM Film f JOIN f.actors a WHERE a.id = :actorId")
    List<Film> findFilmsByActorId(@Param("actorId") Integer actorId);
}