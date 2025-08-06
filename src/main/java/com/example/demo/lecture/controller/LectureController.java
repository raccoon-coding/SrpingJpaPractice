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
    public ResponseEntity<String> register(@RequestBody LectureDto.Register dto) {
        LectureService.register(dto);

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
    public ResponseEntityList<List<LectureDto.Lecture>> search(String name) {
        List<LectureDto.Lecture> response = lectureService.search(name);


        return ResponseEntity.lecture(200).body(response);
    }

}
