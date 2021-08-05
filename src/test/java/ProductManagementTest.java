import domain.Product;
import domain.TypeOfProduct;
import market.services.ProductManager;
import org.junit.Test;

public class ProductManagementTest {


    @Test
    public void createProdutTest(){

    ProductManager productManager = new ProductManager();
            Product expectedProduct = getExpectedProduct();
            Product product = productManager.createProduct("eggs",1.0, TypeOfProduct.FRESH_FOOD);
            assert expectedProduct.getName().equals(product.getName());
            assert expectedProduct.getPrice() == product.getPrice();
            assert expectedProduct.getType().equals(product.getType());

    }

    private Product getExpectedProduct(){
       return  Product.builder()
                .name("eggs")
                .price(1.0)
                .type(TypeOfProduct.FRESH_FOOD)
               .build();
    }
}
