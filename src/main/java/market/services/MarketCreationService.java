package market.services;

import Dto.CreateSuperFoodMarketDto;
import domain.SuperFoodMarket;
import org.springframework.stereotype.Service;

@Service
public class MarketCreationService {

    public SuperFoodMarket createSuperFoodMarket(CreateSuperFoodMarketDto createSuperFoodMarketDto){
        return SuperFoodMarket.builder()
                .adress(createSuperFoodMarketDto.getAdress())
                .id(createSuperFoodMarketDto.getId())
                .employees(createSuperFoodMarketDto.getEmployees())
                .name(createSuperFoodMarketDto.getName())
                .products(createSuperFoodMarketDto.getProducts())
                .build();
    }
}
