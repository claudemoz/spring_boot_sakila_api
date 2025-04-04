package com.sakila.rest.controllers;

import com.sakila.rest.entities.Film;
import com.sakila.rest.services.FilmService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmControllers {
    private final FilmService service;
    public FilmControllers(FilmService service) {
        this.service = service;
    }

    @GetMapping("get")
    public List<Film> getFilmByTitle(@RequestParam String name){
        return service.searchFilmByTitle(name);
    }

    @GetMapping("get")
    public List<Film> getFilmByActor(@RequestParam String name){
        return service.searchFilmByActor(name);
    }
}
