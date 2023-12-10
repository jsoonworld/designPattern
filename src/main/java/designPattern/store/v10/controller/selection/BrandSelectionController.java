package designPattern.store.v10.controller.selection;

import designPattern.store.v10.model.enums.StoreType;
import designPattern.store.v10.model.strategy.BrandStrategy;
import designPattern.store.v10.model.strategy.LuxuryBrandStrategy;
import designPattern.store.v10.model.strategy.PcRoomBrandStrategy;
import designPattern.store.v10.model.strategy.SportsBrandStrategy;
import designPattern.store.v10.view.InputView;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;


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
        StringJoiner brandOptions = new StringJoiner(", ");
        for (String brand : BRAND_OPTIONS.get(storeType)) {
            brandOptions.add(brand);
        }

        String brandChoice = inputView.getInput("Available brands: " + brandOptions.toString() + "\nEnter brand name: ");
        BrandStrategy brandStrategy = BRAND_STRATEGIES.get(storeType);
        if (brandStrategy == null) {
            throw new IllegalArgumentException("Invalid store type");
        }
        return brandStrategy.selectBrand(brandChoice);
    }
}
