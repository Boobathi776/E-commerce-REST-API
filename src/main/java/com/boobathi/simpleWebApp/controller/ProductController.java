package com.boobathi.simpleWebApp.controller;

import com.boobathi.simpleWebApp.model.Product;
import com.boobathi.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @RequestMapping("/products")
    public List<Product> getProduct(){
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}") //for dynamic purpose we use "{ }" to get the value
    public Product getProductById(@PathVariable int prodId) //pathvariable annotaion used to match the given value in the path or url to the method variable
    {
        return service.getProductById(prodId);
    }

    @PostMapping ("/products")
    public void addProduct(@RequestBody Product prod){
        System.out.println(prod);
        service.addProducts(prod);
    }

    @PutMapping("/products")
    public void updateProducts(@RequestBody Product prod) // @RequestBody is used to send data from the client to server
    {
        service.updateProducts(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId)
    {
        service.deleteProduct(prodId);
    }
}
