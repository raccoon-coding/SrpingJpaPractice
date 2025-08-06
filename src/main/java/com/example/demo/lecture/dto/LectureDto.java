package com.example.demo.lecture.dto;

import com.example.demo.lecture.entity.LectureEntity;

public class LectureDto {
    public static class Lecture {
        private Integer id;
        private String title;
        private String contents;
        private Integer time;
        private Integer price;

        public static LectureDto.Lecture from(LectureEntity entity) {
            LectureDto.Lecture dto = new LectureDto.Lecture();
            dto.setId(entity.getId());
            dto.setTitle(entity.getTitle());
            dto.setContents(entity.getContents());
            dto.setTime(entity.getTime());
            dto.setPrice(entity.getPrice());

            return dto;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContents() {
            return contents;
        }

        public void setContents(String contents) {
            this.contents = contents;
        }

        public Integer getTime() {
            return time;
        }

        public void setTime(Integer time) {
            this.time = time;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }
    }

    public static class Register {
        private String title;
        private String contents;
        private Integer time;
        private Integer price;

        public LectureEntity toEntity() {
            LectureEntity entity = new LectureEntity();
            entity.setTitle(title);
            entity.setContents(contents);
            entity.setTime(time);
            entity.setPrice(price);

            return entity;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContents() {
            return contents;
        }

        public void setContents(String contents) {
            this.contents = contents;
        }

        public Integer getTime() {
            return time;
        }

        public void setTime(Integer time) {
            this.time = time;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }
    }
}
