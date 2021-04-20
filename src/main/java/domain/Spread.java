package domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Spread extends Product{

private TypeOfHazelnut typeOfHazelnut;

}
