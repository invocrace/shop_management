package market.services;

import domain.Department;
import domain.Store;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StoreManagement {

    private final String UNDERSCORE = "_";

    public Store createStore(String name, List<Department> departments) {
        String randdomUID = UUID.randomUUID().toString();

        return Store.builder()
                .id(String.join(name, UNDERSCORE, randdomUID))
                .name(name)
                .departments(departments)
                .build();
    }
}
