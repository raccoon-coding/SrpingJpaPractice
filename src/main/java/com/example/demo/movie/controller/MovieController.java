package com.example.demo.movie.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/read")
    public ResponseEntity<MovieDto.Movie> readMovieByName(String title) {
        MovieDto.Movie dto = movieService.search(title);
        return ResponseEntity.status(200).body(dto);
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerMovie(@RequestBody String title,
                                                @RequestBody String contents,
                                                @RequestBody Integer time) {
        MovieDto.Register dto = new MovieDto.Register();
        dto.setTitle(title);
        dto.setContents(contents);
        dto.setTile(time);

        movieService.register(dto);
        return ResponseEntity.status(200).body("저장 완료했습니다.");
    }

    @GetMapping("/list")
    public ResponseEntity<List<MovieDto.Movie>> getMovies() {
        List<MovieDto.Movie> dto = movieService.list();
        return ResponseEntity.status(200).body(dto);
    }
}
