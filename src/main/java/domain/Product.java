package domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@Builder
public class Product {
    protected String id;
    protected String name;
    protected String creationDate;
    protected double price;
    protected TypeOfProduct type;

}
