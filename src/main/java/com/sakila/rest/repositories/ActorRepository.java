package com.sakila.rest.repositories;

import com.sakila.rest.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer> {

    @Query("SELECT a FROM Actor a WHERE LOWER(a.firstName) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR LOWER(a.lastName) LIKE LOWER(CONCAT('%', :searchTerm, '%'))")
    List<Actor> findByNameContainingIgnoreCase(@Param("searchTerm") String searchTerm);

    @Query("SELECT a FROM Actor a JOIN FETCH a.films WHERE a.id = :actorId")
    Actor findActorWithFilms(@Param("actorId") Integer actorId);
}