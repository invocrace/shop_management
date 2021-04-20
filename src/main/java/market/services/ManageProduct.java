package market.services;

import domain.Product;
import domain.SuperFoodMarket;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ManageProduct {

    public List<Product> getListOfProductByName(SuperFoodMarket market, String nameOfProduct){
        return market.getProducts().stream()
                .filter(product -> product.getName().equals(nameOfProduct))
                .collect(Collectors.toList());
    }
     public int getNumberOfProductInStock (SuperFoodMarket market, String nameOfProduct){
        return getListOfProductByName(market, nameOfProduct).size();
     }
}
