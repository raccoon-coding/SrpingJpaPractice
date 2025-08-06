package com.example.demo.lecture.dto;

public class LectureDto {
    public static class Lecture {
        private Integer id;
        private String title;
        private String description;
        private Integer totalTime;
        private Integer price;

        public static LectureDto.Lecture from(LectureEntity entity) {
            LectureDto.Lecture dto = new LectureDto.Lecture();
            dto.setId(entity.getId());
            dto.setTitle(entity.getTitle());
            dto.setDescription(entity.getDescription());
            dto.setTotalTime(entity.getTotalTime());
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

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Integer getTotalTime() {
            return totalTime;
        }

        public void setTotalTime(Integer totalTime) {
            this.totalTime = totalTime;
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
        private String description;
        private Integer totalTime;
        private Integer price;

        public LectureEntity toEntity() {
            LectureEntity entity = new LectureEntity();
            entity.setTitle(title);
            entity.setDescription(description);
            entity.setTotalTime(totalTime);
            entity.setPrice(price);

            return entity;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Integer getTotalTime() {
            return totalTime;
        }

        public void setTotalTime(Integer totalTime) {
            this.totalTime = totalTime;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }
    }
}
