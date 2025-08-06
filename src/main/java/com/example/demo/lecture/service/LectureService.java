package com.example.demo.lecture.service;

import com.example.demo.lecture.dto.LectureDto;
import com.example.demo.lecture.entity.LectureEntity;
import com.example.demo.lecture.repository.LectureRepository;
import com.example.demo.menu.entity.MenuEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LectureService {
    private final LectureRepository lectureRepository;

    public void register(LectureDto.Register dto) {
        lectureRepository.save(dto.toEntity());
    }

    public LectureDto.Lecture read(Integer id) {
        Optional<LectureEntity> optionalEntity = lectureRepository.findById(id);
        if (optionalEntity.isPresent()) {
            LectureEntity entity = optionalEntity.get();

            return LectureDto.Lecture.from(entity);
        }

        return null;
    }

    public List<LectureDto.Lecture> list() {
        List<LectureEntity> list = lectureRepository.findAll();
        return list.stream().map(LectureDto.Lecture::from).toList();
    }

    public List<LectureDto.Lecture> search(String title) {
        List<LectureEntity> result = lectureRepository.findByTitle(title);
        return result.stream().map(LectureDto.Lecture::from).toList();
    }
}
