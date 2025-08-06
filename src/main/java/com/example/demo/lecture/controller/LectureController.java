package com.example.demo.lecture.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lecture")
public class LectureController {
    private final LectureService lectureService;

    public LectureController(LectureService lectureService) {
        this.lectureService = lectureService;
    }

    @PostMapping("/register")
    public ResponseEntity<LectureService> register(@RequestBody LectureDto.Register dto) {
        LectureService.register(dto);

        return ResponseEntity.status(200).body("등록 성공");
    }

    @GetMapping("/list")
    public ResponseEntity<LectureDto.Lecture> list() {
        List<LectureDto.Lecture> response = studentService.list();

        return ResponseEntity.status(200).body(response);
    }

    @GetMapping("/read")
    public ResponseEntity<LectureDto.Lecture> read(Integer idx) {
        LectureDto.Lecture response = studentService.read(idx);

        return ResponseEntity.status(200).body(response);
    }


    @GetMapping("/search")
    public ResponseEntity<LectureDto.Lecture> search(String name) {
        List<LectureDto.Lecture> response = LectureService.search(name);


        return ResponseEntity.lecture(200).body(response);
    }

}
