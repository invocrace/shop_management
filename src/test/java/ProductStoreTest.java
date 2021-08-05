import domain.Department;
import domain.Store;
import market.services.StoreManager;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProductStoreTest {

    @Test
    public void createStoreTest() {

        StoreManager storeManager = new StoreManager();


        Department department = Department.builder()
                .name("fresh section")
                .build();

        List<Department> departments = new ArrayList<>();
        departments.add(department);

        String name = "CARROUF";

        String id = UUID.randomUUID().toString();

        Store expectedStore = getExpectedStore(departments, name, id);
        Store actualStore = storeManager.createStore(name, departments);
        actualStore.setId(id);

        assert actualStore.getDepartments().equals(expectedStore.getDepartments());
        assert actualStore.getName().equals(expectedStore.getName());
        assert actualStore.getId().equals(expectedStore.getId());
    }

    private Store getExpectedStore(List<Department> departments, String name,String id) {
        return Store.builder()
                .name(name)
                .departments(departments)
                .id(id)
                .build();
    }
}
