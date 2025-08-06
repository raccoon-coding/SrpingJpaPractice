package com.example.demo.menu.controller;

import com.example.demo.menu.service.MenuService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {
    private final MenuService menuService;

    public MenuController(MenuService menuservice) {
        this.menuService = menuservice;
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody MenuDto.Register dto) {
        menuService.register(dto);

        return ResponseEntity.status(200).body("등록 완료");
    }

    @GetMapping("/read")
    public ResponseEntity read(@RequestParam int id) {
        MenuDto.Menu result = menuService.read(id);

        return ResponseEntity.status(200).body(result);
    }

    @GetMapping("/list")
    public ResponseEntity list() {
        List<MenuDto.Menu> result = menuService.list();

        return ResponseEntity.status(200).body(result);
    }

    @GetMapping("/search")
    public ResponseEntity search(@RequestParam String name) {
        List<MenuDto.Menu> result = menuService.search(name);

        return ResponseEntity.status(200).body(result);
    }
}
