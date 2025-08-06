package com.example.demo.menu.repository;

import com.example.demo.menu.entity.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<MenuEntity, Integer> {
    List<MenuEntity> findByName(String name);
    List<MenuEntity> findByCalories(Integer calories);
}
