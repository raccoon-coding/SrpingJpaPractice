package com.example.demo.board.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void register(BoardDto.Register dto) {
        BoardRepogitory.save(dto.toEntiry());
    }

    public List<BoardDto.Board> list() {
        List<BoardEntity> result = BoardRepository.findAll();

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

    public List<BoardDto.Board> search(String name) {
        List<BoardEntity> result = BoardRepository.findByName(name);

        return result.stream().map(BoardDto.Board::from).toList();
    }
}
