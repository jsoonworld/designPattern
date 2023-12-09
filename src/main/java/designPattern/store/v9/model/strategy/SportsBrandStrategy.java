package designPattern.store.v9.model.strategy;

import designPattern.store.v9.model.strategy.BrandStrategy;

import java.util.Arrays;
import java.util.List;

public class SportsBrandStrategy implements BrandStrategy {
    private static final List<String> SPORTS_BRANDS = Arrays.asList("Nike", "Adidas", "Under Armour");

    @Override
    public String selectBrand(String inputBrand) {
        // 사용자 입력된 브랜드가 목록에 있는지 확인
        if (SPORTS_BRANDS.contains(inputBrand)) {
            return inputBrand;
        } else {
            throw new IllegalArgumentException("Invalid brand: " + inputBrand);
        }
    }
}
