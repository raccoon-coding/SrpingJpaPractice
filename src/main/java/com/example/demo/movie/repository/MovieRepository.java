package com.example.demo.movie.repository;

import com.example.demo.movie.model.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<MovieEntity, Integer> {
    List<MovieEntity> findByTitle(String title);
}
