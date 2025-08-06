package com.example.demo.movie.service;

import com.example.demo.movie.dto.MovieDto;
import com.example.demo.movie.model.MovieEntity;
import com.example.demo.movie.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void register(MovieDto.Register dto) {
        movieRepository.save(dto.toEntity());
    }

    public List<MovieDto.Movie> list() {
        List<MovieEntity> result = movieRepository.findAll();

        return result.stream().map(MovieDto.Movie::from).toList();
    }

    public MovieDto.Movie read(Integer id) {
        Optional<MovieEntity> result = movieRepository.findById(id);

        if (result.isPresent()) {
            MovieEntity entity = result.get();

            return MovieDto.Movie.from(entity);
        }

        return null;
    }

    public List<MovieDto.Movie> search(String title) {
        List<MovieEntity> result = movieRepository.findByTitle(title);

        return result.stream().map(MovieDto.Movie::from).toList();
    }
}
