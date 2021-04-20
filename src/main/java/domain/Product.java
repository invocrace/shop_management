package domain;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public abstract class Product {
    protected int id;
    protected String name;
    protected String creationDate;
    protected Double price;
}
