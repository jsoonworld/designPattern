package designPattern.store.v9.model.strategy;

import java.util.Arrays;
import java.util.List;

public class SportsBrandStrategy implements BrandStrategy {
    private static final List<String> SPORTS_BRANDS = Arrays.asList("Nike", "Adidas", "Under Armour");

    @Override
    public String selectBrand(String inputBrand) {
        if (SPORTS_BRANDS.contains(inputBrand)) {
            return inputBrand;
        }
        throw new IllegalArgumentException("Invalid brand: " + inputBrand);
    }
}
