package com.example.demo.model;

public class ProductDto {

    public static class Product {
        private Integer id;
        private String name;
        private String contents;
        private Integer price;

        public static ProductDto.Product from(ProductEntity entity) {

            ProductDto.Product dto = new ProductDto.Product();
            dto.setId(entity.getId());
            dto.setName(entity.getName());
            dto.setContents(entity.getContents());
            dto.setPrice(entity.getPrice());

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

        public String getContents() {
            return contents;
        }

        public void setContents(String contents) {
            this.contents = contents;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }
    }

    public static class Register {
        private String name;
        private String contents;
        private Integer price;

        public ProductEntity toEntity() {
            ProductEntity entity = new ProductEntity();
            entity.setName(name);
            entity.setContents(contents);
            entity.setPrice(price);
            return entity;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getContents() {
            return contents;
        }

        public void setContents(String contents) {
            this.contents = contents;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }
    }


}
