package com.example.demo.board.service;

import com.example.demo.board.dto.BoardDto;
import com.example.demo.board.entity.BoardEntity;
import com.example.demo.board.repository.BoardRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public void register(BoardDto.Register dto) {
        boardRepository.save(dto.toEntity());
    }

    public List<BoardDto.Board> list() {
        List<BoardEntity> result = boardRepository.findAll();

        return result.stream().map(BoardDto.Board::from).toList();
    }

    public List<BoardDto.Board> search(String title) {
        List<BoardEntity> result = boardRepository.findByTitle(title);

        return result.stream().map(BoardDto.Board::from).toList();
    }

    public BoardDto.Board read(Integer idx) {
        Optional<BoardEntity> result = boardRepository.findById(idx);

        if(result.isPresent()) {
            BoardEntity entity = result.get();

            return BoardDto.Board.from(entity);
        }

        return null;
    }
}
