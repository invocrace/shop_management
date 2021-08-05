package market.services;

import domain.Department;
import domain.Store;

import java.util.List;
import java.util.UUID;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class StoreManager {

    private final String UNDERSCORE = "_";

    public Store createStore(String name, List<Department> departments) {
        LOGGER.info("creation of a new Store start");

        String randdomUID = UUID.randomUUID().toString();

        return Store.builder()
                .id(String.join(name, UNDERSCORE, randdomUID))
                .name(name)
                .departments(departments)
                .build();
    }
}
