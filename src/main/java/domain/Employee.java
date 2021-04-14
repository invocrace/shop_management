package domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@Builder
public class Employee {
    private int id;
    private String name;
    private String lastName;
    private int age;
    private String adress;
}
