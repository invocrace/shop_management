package domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Builder
public class Department {
    String name;
    List<Product> typesOfProduct;
}
