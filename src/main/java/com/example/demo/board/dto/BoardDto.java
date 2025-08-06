package com.example.demo.board.dto;

public class BoardDto {
    public static class Board {
        private Integer id;
        private String title;
        private String contents;

        public static BoardDto.Board from(BoardEntity entity) {
            BoardDto.Board dto = new BoardDto.Board();
            dto.setId(entity.getId());
            dto.setTitle(entity.getTitle());
            dto.setContents(entity.getContents());

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
    }

    public static class Register {
        private String title;
        private String contents;

        public BoardEntity toEntity() {
            BoardEntity entity = new BoardEntity();
            entity.setTitle(title);
            entity.setContents(contents);

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
    }
}
