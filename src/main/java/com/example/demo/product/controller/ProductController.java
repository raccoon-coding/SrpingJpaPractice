package com.example.demo.product.controller;

import com.example.demo.product.model.ProductDto;
import com.example.demo.product.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/register")
    public ResponseEntity<String> register(@RequestBody ProductDto.Register dto) {
        productService.register(dto);
        return ResponseEntity.status(200).body("등록 완료");
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
