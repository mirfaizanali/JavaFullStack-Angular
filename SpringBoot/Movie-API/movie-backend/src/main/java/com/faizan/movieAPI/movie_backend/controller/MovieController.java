
package com.faizan.movieAPI.movie_backend.controller;

import com.faizan.movieAPI.movie_backend.entity.Movie;
import com.faizan.movieAPI.movie_backend.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @Autowired
    private MovieService service;

    @GetMapping
    public List<Movie> getAllMovies(){
        return service.getAllMovies();
    }

    @GetMapping("/{id}")
    public Optional<Movie> getById(@PathVariable int id){
        return service.getById(id);
    }

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie){
        return service.addMovie(movie);
    }

    @PutMapping("/{id}")
    public void updateMovie(@PathVariable int id , @RequestBody Movie movie){
        service.updateMovie(movie);
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable int id){
        service.deleteMovie(id);
    }


}
