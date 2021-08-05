package domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@Builder
public abstract class Product {
    protected String id;
    protected String name;
    protected String creationDate;
    protected double price;
    protected TypeOfProduct type;

}
