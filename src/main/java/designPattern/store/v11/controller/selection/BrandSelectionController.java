package designPattern.store.v11.controller.selection;

import designPattern.store.v11.model.enums.StoreType;
import designPattern.store.v11.model.strategy.BrandStrategy;
import designPattern.store.v11.model.strategy.LuxuryBrandStrategy;
import designPattern.store.v11.model.strategy.PcRoomBrandStrategy;
import designPattern.store.v11.model.strategy.SportsBrandStrategy;
import designPattern.store.v11.view.InputView;

import java.util.HashMap;
import java.util.Map;


public class BrandSelectionController {
    private static final Map<StoreType, String[]> BRAND_OPTIONS = new HashMap<>();
    private static final Map<StoreType, BrandStrategy> BRAND_STRATEGIES = new HashMap<>();
    private final InputView inputView;

    static {
        BRAND_OPTIONS.put(StoreType.LUXURY, new String[]{"Hermes", "Louis Vuitton", "Chanel"});
        BRAND_OPTIONS.put(StoreType.SPORTS, new String[]{"Nike", "Adidas", "Under Armour"});
        BRAND_OPTIONS.put(StoreType.PC_ROOM, new String[]{"Challenger", "Master", "Diamond"});

        BRAND_STRATEGIES.put(StoreType.LUXURY, new LuxuryBrandStrategy());
        BRAND_STRATEGIES.put(StoreType.SPORTS, new SportsBrandStrategy());
        BRAND_STRATEGIES.put(StoreType.PC_ROOM, new PcRoomBrandStrategy());
    }

    public BrandSelectionController(InputView inputView) {
        this.inputView = inputView;
    }

    public String selectBrand(StoreType storeType) {
        String[] brandOptions = BRAND_OPTIONS.get(storeType);
        String brandChoice = inputView.getBrandInput(brandOptions);
        BrandStrategy brandStrategy = BRAND_STRATEGIES.get(storeType);
        if (brandStrategy == null) {
            throw new IllegalArgumentException("Invalid store type");
        }
        return brandStrategy.selectBrand(brandChoice);
    }
}
