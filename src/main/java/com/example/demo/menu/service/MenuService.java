package com.example.demo.menu.service;

import com.example.demo.menu.entity.MenuEntity;
import com.example.demo.menu.model.MenuDto;
import com.example.demo.menu.repository.MenuRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuService {
    private final MenuRepository repository;

    public MenuService(MenuRepository repository) {
        this.repository = repository;
    }

    public void register(MenuDto.Register dto) {
        repository.save(dto.toEntity());
    }

    public MenuDto.Menu read(Integer idx) {
        Optional<MenuEntity> optionalEntity = repository.findById(idx);
        if(optionalEntity.isEmpty()) {
            throw new RuntimeException();
        }
        return MenuDto.Menu.from(optionalEntity.get());
    }

    public List<MenuDto.Menu> list() {
        List<MenuEntity> menus = repository.findAll();
        return menus.stream().map(MenuDto.Menu::from).toList();
    }

    public List<MenuDto.Menu> search(String name) {
        List<MenuEntity> menus = repository.findByName(name);
        return menus.stream().map(MenuDto.Menu::from).toList();
    }
}
