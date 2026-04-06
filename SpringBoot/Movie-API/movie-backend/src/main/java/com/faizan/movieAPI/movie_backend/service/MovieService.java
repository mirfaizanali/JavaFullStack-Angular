package com.faizan.movieAPI.movie_backend.service;

import com.faizan.movieAPI.movie_backend.entity.Movie;
import com.faizan.movieAPI.movie_backend.repo.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepo repo;


    public List<Movie> getAllMovies() {
        return  repo.findAll();
    }

    public Optional<Movie> getById(int id) {
        return  repo.findById(id);
    }

    public Movie addMovie(Movie movie) {
        return repo.save(movie);
    }

    public void updateMovie(Movie movie) {
         repo.save(movie);
    }

    public void deleteMovie(int id) {
        repo.deleteById(id);
    }
}
