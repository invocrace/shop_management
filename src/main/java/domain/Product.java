package domain;

import lombok.ToString;

@ToString
public abstract class Product {
    protected int id;
    protected String name;
    protected String creationDate;
}
