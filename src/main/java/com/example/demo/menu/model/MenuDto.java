package com.example.demo.menu.model;

import com.example.demo.menu.entity.MenuEntity;

public class MenuDto {
    public static class Menu{
        private Integer id;
        private String name;
        private Integer price;
        private Integer calorie;

        public static MenuDto.Menu from(MenuEntity entity) {
            MenuDto.Menu dto = new MenuDto.Menu();
            dto.setId(entity.getId());
            dto.setName(entity.getName());
            dto.setPrice(entity.getPrice());
            dto.setCalorie(entity.getCalories());

            return dto;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        public Integer getCalorie() {
            return calorie;
        }

        public void setCalorie(Integer calorie) {
            this.calorie = calorie;
        }
    }

    public static class Register{
        private String name;
        private Integer price;
        private Integer calorie;

        public MenuEntity toEntity() {
            MenuEntity entity = new MenuEntity();
            entity.setName(name);
            entity.setPrice(price);
            entity.setCalories(calorie);

            return entity;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        public Integer getCalorie() {
            return calorie;
        }

        public void setCalorie(Integer calorie) {
            this.calorie = calorie;
        }
    }
}
