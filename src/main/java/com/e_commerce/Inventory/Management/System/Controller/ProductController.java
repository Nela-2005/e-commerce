package com.e_commerce.Inventory.Management.System.Controller;
import com.e_commerce.Inventory.Management.System.Dto.ProductDto;
import com.e_commerce.Inventory.Management.System.Entity.Product;
import com.e_commerce.Inventory.Management.System.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id){
        Product product = productService.getProductById(id);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody ProductDto productDto){
        Product product = this.productService.createProduct(productDto);
        return ResponseEntity.ok(product);
    }

//    @PatchMapping
//    public void update(@RequestBody ProductDto productDto){
//        productService.updateProduct(productDto);
//    }
}