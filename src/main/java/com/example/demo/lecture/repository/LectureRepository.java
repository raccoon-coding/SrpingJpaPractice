package com.example.demo.lecture.repository;

import com.example.demo.lecture.entity.LectureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LectureRepository extends JpaRepository<LectureEntity, Integer> {
    List<LectureEntity> findByTitle(String title);
}
