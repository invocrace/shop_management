package domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@ToString
@NoArgsConstructor
@Builder
@Getter
public class SuperFoodMarket {
    private int id;
    private String name;
    private String adress;
    private List<Product> products;
    private List<Employee> employees;
}
