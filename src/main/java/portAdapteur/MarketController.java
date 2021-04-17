package portAdapteur;

import Dto.CreateSuperFoodMarketDto;
import market.services.MarketCreationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarketController {

    final String SUCCESS = "SUCCESS";

       MarketCreationService marketCreationService;

    @PostMapping(value = "/create")
    public String createSuperFoodMarket(@RequestBody CreateSuperFoodMarketDto createSuperFoodMarketDto) {

        try {
            marketCreationService.createSuperFoodMarket(createSuperFoodMarketDto);

            return SUCCESS;
        }catch (Exception e){
            return "failed to create superFoodMarket cause of : "+e;
        }
    }
}
