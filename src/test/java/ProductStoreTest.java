import domain.Department;
import domain.Store;
import market.services.StoreManagement;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProductStoreTest {

    @Test
    public void createStoreTest() {

        StoreManagement storeManagement = new StoreManagement();

        List<Department> departments = new ArrayList<>();
        Department department = Department.builder()
                .name("fresh section")
                .build();

        String name = "CARROUF";

        String id = UUID.randomUUID().toString();

        Store expectedStore = getExpectedStore(departments, name, id);
        Store actualStore = storeManagement.createStore(name, departments);
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
