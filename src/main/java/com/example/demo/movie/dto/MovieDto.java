package com.example.demo.movie.dto;

import com.example.demo.board.dto.BoardDto;
import com.example.demo.board.entity.BoardEntity;

public class MovieDto {
    public static class Movie {
        private Integer id;
        private String title;
        private String description;
        private Integer time;

        public static MovieDto.Movie from(MovieEntity entity) {
            MovieDto.Movie dto = new MovieDto.Movie();
            dto.setId(entity.getId());
            dto.setTitle(entity.getTitle());
            dto.setDescription(entity.getDescription());
            dto.setTime(entity.getTime());

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

        public Integer getTime() {
            return time;
        }

        public void setTime(Integer time) {
            this.time = time;
        }
    }

    public static class Register {
        private String title;
        private String description;
        private Integer time;

        public MovieEntity toEntity() {
            MovieEntity entity = new MovieEntity();
            entity.setTitle(title);
            entity.setDescription(description);
            entity.setTime(time);

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

        public Integer getTime() {
            return time;
        }

        public void setTime(Integer time) {
            this.time = time;
        }
    }
}
