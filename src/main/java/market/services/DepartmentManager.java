package market.services;

import domain.Department;
import domain.TypeOfProduct;

import java.util.List;

public class DepartmentManager {

    public Department createDepartment(String name, List<TypeOfProduct> typesOfProduct){

      return  Department.builder()
                .name(name)
                .typesOfProduct(typesOfProduct)
                .build();
    }
}
