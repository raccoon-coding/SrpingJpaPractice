package com.example.demo.movie.controller;

import com.example.demo.movie.dto.MovieDto;
import com.example.demo.movie.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/read")
    public ResponseEntity<MovieDto.Movie> readMovieByName(Integer idx) {
        MovieDto.Movie dto = movieService.read(idx);
        return ResponseEntity.status(200).body(dto);
    }

    @GetMapping("/search")
    public ResponseEntity<List<MovieDto.Movie>> readMovieByName(String title) {
        List<MovieDto.Movie> dto = movieService.search(title);
        return ResponseEntity.status(200).body(dto);
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerMovie(@RequestBody MovieDto.Register dto) {
        movieService.register(dto);
        return ResponseEntity.status(200).body("저장 완료했습니다.");
    }

    @GetMapping("/list")
    public ResponseEntity<List<MovieDto.Movie>> getMovies() {
        List<MovieDto.Movie> dto = movieService.list();
        return ResponseEntity.status(200).body(dto);
    }
}
