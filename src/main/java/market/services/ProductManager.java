package market.services;

import domain.Product;
import domain.TypeOfProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;


public class ProductManager {

    private final String UNDERSCORE = "_";

    public Product createProduct(String name, double price, TypeOfProduct typeOfProduct){

        LOGGER.info("creation of a new Product start");

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
