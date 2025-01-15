package com.boobathi.simpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
//@AllArgsConstructor  // for constructor by lombok
@Component
@Entity   //used to create table with the name of class Product
public class Product {
    @Id      //using this we can mention the primary key
    private int prodId;  // this is the primary key
    private String prodName;
    private int price;

    public Product()  // i don't know why i mention it here but i should learn it don't forget
    {
    }

    public Product(int prodId, String prodName, int price) {
       this.prodId = prodId;
       this.prodName = prodName;
       this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                '}';
    }
}
