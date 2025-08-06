package com.example.demo.menu.model;

import lombok.Builder;
import lombok.Getter;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
import com.example.demo.menu.entity.MenuEntity;

public class MenuDto {
    @Builder
    public static class Menu{
        private Integer id;
        private String name;
        private Integer price;
        private Integer calorie;

        public static MenuDto.Menu from(MenuEntity entity) {
            MenuDto.Menu dto = Menu.builder()
                    .id(entity.getId())
                    .name(entity.getName())
                    .price(entity.getPrice())
                    .calorie(entity.getCalorie())
                    .build();

            return dto;
        }
    }

    @Getter
    public static class Register{
        private String name;
        private Integer price;
        private Integer calorie;

        public MenuEntity toEntity() {
            MenuEntity entity = MenuEntity.builder()
                    .name(name)
                    .price(price)
                    .calorie(calorie)
                    .build();
            return entity;
        }
    }
}
