package market.services;

import domain.Department;
import domain.Product;

import java.util.List;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class DepartmentManager {

    public Department createDepartment(String name, List<Product> products){
        LOGGER.info("creation of a new Department start");

      return  Department.builder()
                .name(name)
                .products(products)
                .build();
    }

}
