package com.example.demo.board.controller;

import com.example.demo.board.dto.BoardDto;
import com.example.demo.board.service.BoardService;
import com.example.demo.product.model.ProductDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody BoardDto.Register board) {

        boardService.register(board);

        return ResponseEntity.status(200).body("등록 성공");
    }

    @GetMapping("/list")
    public ResponseEntity<List<BoardDto.Board>> list() {
        List<BoardDto.Board> response = boardService.list();

        return ResponseEntity.status(200).body(response);
    }

    @GetMapping("/read")
    public ResponseEntity<BoardDto.Board> read(@RequestParam int id) {
        BoardDto.Board response = boardService.read(id);

        return ResponseEntity.status(200).body(response);
    }

    @GetMapping("/search")
    public ResponseEntity<List<BoardDto.Board>> search(@RequestParam String title) {
        List<BoardDto.Board> response = boardService.search(title);

        return ResponseEntity.status(200).body(response);
    }

}
