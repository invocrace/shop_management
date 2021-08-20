import domain.Department;
import domain.Product;
import market.services.DepartmentManager;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DepartmentManagerTest {

    @Test
    public void createDepartmentTest() {
        DepartmentManager departmentManager = new DepartmentManager();

        String name = "FRESH_SECTION";

        Product salad = Product.builder()
                .name("SALAD")
                .build();

        List<Product> products = new ArrayList<>();
        products.add(salad);


        Department expectedDepartment = getDepartment(name,products);
        Department actualDepartment = departmentManager.createDepartment(name,products);

        assert actualDepartment.getName().equals(expectedDepartment.getName());
        assert actualDepartment.getProducts().equals(expectedDepartment.getProducts());

    }

    private Department getDepartment(String name, List<Product>products){
        return Department.builder()
                .name(name)
                .products(products)
                .build();
    }
}
