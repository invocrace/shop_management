package market.services;

import domain.Department;
import domain.Product;

import java.util.List;

public class DepartmentManager {

    public Department createDepartment(String name, List<Product> products){

      return  Department.builder()
                .name(name)
                .typesOfProduct(products)
                .build();
    }
}
