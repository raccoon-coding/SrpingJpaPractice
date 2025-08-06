package com.example.demo.product.controller;

import com.example.demo.product.model.ProductDto;
import com.example.demo.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody ProductDto.Register dto) {
        ProductService.register(dto);

        return ResponseEntity.status(200).body("등록 성공");
    }

    @GetMapping("/list")
    public ResponseEntity<List<ProductDto.Product>> list() {
        List<ProductDto.Product> response = productService.list();

        return ResponseEntity.status(200).body(response);
    }

    @GetMapping("/read")
    public ResponseEntity<ProductDto.Product> read(Integer idx) {
        ProductDto.Product response = productService.read(idx);

        return ResponseEntity.status(200).body(response);
    }

    @GetMapping("/search")
    public ResponseEntity<List<ProductDto.Product>> search(String name) {
        List<ProductDto.Product> response = productService.search(name);

        return ResponseEntity.status(200).body(response);
    }

}
