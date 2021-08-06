package market.services;

import domain.Product;
import domain.TypeOfProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;


public class ProductManager {

    private final String UNDERSCORE = "_";

    public Product createProduct(String name, double price, TypeOfProduct typeOfProduct){

        String randdomUID = UUID.randomUUID().toString();
        String productDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd LLLL yyyy"));

        return Product.builder()
                .id(String.join(name, UNDERSCORE,randdomUID, UNDERSCORE,productDate))
                .creationDate(productDate)
                .name(name)
                .price(price)
                .type(typeOfProduct)
                .build();
    }
}
