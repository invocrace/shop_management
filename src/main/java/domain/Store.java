package domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Builder
public class Store {

    private String id;
    private String name;
    private List<Department> departments;
}
