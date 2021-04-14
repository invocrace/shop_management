package Dto;

import domain.Employee;
import domain.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class CreateSuperFoodMarketDto {
    private int id;
    private String name;
    private String adress;
    private List<Product> products;
    private List<Employee> employees;

}
