package com.example.demo.movie.service;

import com.example.demo.movie.dto.MovieDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public static void register(MovieDto.Register dto) {
        movieRepository.save(dto.toEntity());
    }

    public static List<MovieDto.Movie> list() {
        List<MovieDto.Movie> result = movieRepository.findAll();

        return result.stream().map(MovieDto.Movie::from).toList();
    }

    public static MovieDto.Movie read(Integer id) {
        Optional<MovieEntity> result = movieRepository.findById(id);

        if (result.isPresent()) {
            MovieEntity entity = result.get();

            return MovieDto.Movie.from(entity);
        }

        return null;
    }

    public static List<MovieDto.Movie> search(String title) {
        List<MovieDto.Movie> result = movieRepository.findByTitle();

        return result.stream().map(MovieDto.Movie::from).toList();
    }
}
