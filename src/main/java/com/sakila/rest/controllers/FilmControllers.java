package com.sakila.rest.controllers;

import com.sakila.rest.entities.Actor;
import com.sakila.rest.entities.Film;
import com.sakila.rest.services.FilmService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/film")
public class FilmControllers {
    private final FilmService service;
    public FilmControllers(FilmService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<Film> getAllFilms() {
        return service.findAllFilms();
    }
    @GetMapping("/search")
    public List<Film> searchFilms(@RequestParam String title) {
        return service.searchFilmsByTitle(title);
    }

    @GetMapping("/{id}/actors")
    public ResponseEntity<Set<Actor>> getActorsByFilm(@PathVariable Integer id) {
        Film film = service.getFilmWithActors(id);
        if (film == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(film.getActors());
    }

    @GetMapping("/actor/{actorId}")
    public List<Film> getFilmsByActor(@PathVariable Integer actorId) {
        return service.findFilmsByActorId(actorId);
    }
}
