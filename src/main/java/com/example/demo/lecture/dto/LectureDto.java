package com.example.demo.lecture.dto;

import com.example.demo.lecture.entity.LectureEntity;
import lombok.Builder;
import lombok.Getter;

public class LectureDto {
    @Getter @Builder
    public static class Lecture {
        private Integer id;
        private String title;
        private String contents;
        private Integer time;
        private Integer price;

        public static LectureDto.Lecture from(LectureEntity entity) {
            LectureDto.Lecture dto = Lecture.builder()
                    .id(entity.getId())
                    .title(entity.getTitle())
                    .contents(entity.getContents())
                    .time(entity.getTime())
                    .price(entity.getPrice())
                    .build();

            return dto;
        }
    }

    @Getter
    public static class Register {
        private String title;
        private String contents;
        private Integer time;
        private Integer price;

        public LectureEntity toEntity() {
            LectureEntity entity = LectureEntity.builder()
                    .title(title)
                    .contents(contents)
                    .time(time)
                    .price(price)
                    .build();

            return entity;
        }
    }
}

