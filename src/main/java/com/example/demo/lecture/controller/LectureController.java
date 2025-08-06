package com.example.demo.lecture.controller;

import lombok.RequiredArgsConstructor;
import com.example.demo.lecture.dto.LectureDto;
import com.example.demo.lecture.service.LectureService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/lecture")
public class LectureController {
    private final LectureService lectureService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody LectureDto.Register dto) {
        lectureService.register(dto);

        return ResponseEntity.status(200).body("등록 성공");
    }

    @GetMapping("/list")
    public ResponseEntity<List<LectureDto.Lecture>> list() {
        List<LectureDto.Lecture> response = lectureService.list();

        return ResponseEntity.status(200).body(response);
    }

    @GetMapping("/read")
    public ResponseEntity<LectureDto.Lecture> read(Integer idx) {
        LectureDto.Lecture response = lectureService.read(idx);

        return ResponseEntity.status(200).body(response);
    }

    @GetMapping("/search")
    public ResponseEntity<List<LectureDto.Lecture>> search(String name) {
        List<LectureDto.Lecture> response = lectureService.search(name);

        return ResponseEntity.status(200).body(response);
    }
}
