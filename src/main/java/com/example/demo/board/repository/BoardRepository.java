package com.example.demo.board.repository;

import com.example.demo.board.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<BoardEntity, Integer> {
    List<BoardEntity> findByTitle(String title);
    List<BoardEntity> findByContents(String contents);
}
