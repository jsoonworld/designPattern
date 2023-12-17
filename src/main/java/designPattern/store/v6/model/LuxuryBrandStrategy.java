package designPattern.store.v6.model;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LuxuryBrandStrategy implements BrandStrategy {
    private static final List<String> LUXURY_BRANDS = Arrays.asList("Hermes", "Louis Vuitton", "Chanel");
    private final Random random = new Random();

    @Override
    public String selectBrand() {
        // 랜덤하게 브랜드 선택
        return LUXURY_BRANDS.get(random.nextInt(LUXURY_BRANDS.size()));
    }
}
