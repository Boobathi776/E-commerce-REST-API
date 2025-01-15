package com.boobathi.simpleWebApp.service;

import com.boobathi.simpleWebApp.model.Product;
import com.boobathi.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    @Autowired
     ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101,"Acer Laptop",44000),
//            new Product(102,"Lenovo laptop",56000)));

    public List<Product>  getProducts(){
            return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
//                products.stream()
//                .filter(p -> p.getProdId() == prodId)
////                .findFirst().get();   //findfirst() used to get the first value from the getted values
//                    .findFirst().orElse(new Product(100,"No item",0)); // if there is no prosuct we can show this data
    }


    public void addProducts(Product prod)
    {
//        products.add(prod);
        repo.save(prod);
    }

    public void updateProducts(Product prod) {
//      int  index=0;
//        System.out.println(products.size());
//      for(int i=0;i<products.size();i++)
//          if(products.get(i).getProdId()==prod.getProdId())
//              index=i;  // here we got the index of the object that we are going to update
//         products.set(index,prod);

        repo.save(prod); //it update if the prod found or else it will create that object

    }

    public void deleteProduct(int prodId) {
//        int  index=0;
//        System.out.println(products.size());
//        for(int i=0;i<products.size();i++)
//            if(products.get(i).getProdId()==prodId)
//                index=i;  // here we got the index of the object that we are going to update
//        products.remove(index); // it denotes the product index so we can remove that from the products
        repo.deleteById(prodId);
    }
}
