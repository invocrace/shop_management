import domain.Product;
import domain.TypeOfProduct;
import market.services.ProductManager;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class ProductManagementTest {


    @Test
    public void createProdutTest() {

        String id = UUID.randomUUID().toString();
        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd LLLL yyyy"));


        ProductManager productManager = new ProductManager();
        Product expectedProduct = getExpectedProduct(id, date);
        Product product = productManager.createProduct("eggs", 1.0, TypeOfProduct.FRESH_FOOD);
        product.setId(id);
        product.setCreationDate(date);

        assert product.getType().equals(expectedProduct.getType());
        assert product.getName().equals(expectedProduct.getName());
        assert product.getPrice() == (expectedProduct.getPrice());
        assert product.getId().equals(expectedProduct.getId());
        assert product.getCreationDate().equals(expectedProduct.getCreationDate());

    }

    private Product getExpectedProduct(String id, String date) {
        return Product.builder()
                .id(id)
                .name("eggs")
                .creationDate(date)
                .price(1.0)
                .type(TypeOfProduct.FRESH_FOOD)
                .build();
    }
}
