package designPattern.store.test2.model;

import java.util.Arrays;
import java.util.List;

public class LuxuryBrandStrategy implements BrandStrategy {
    private static final List<String> LUXURY_BRANDS = Arrays.asList("Hermes", "Louis Vuitton", "Chanel");

    @Override
    public String selectBrand(String inputBrand) {
        if (LUXURY_BRANDS.contains(inputBrand)) {
            return inputBrand;
        } else {
            throw new IllegalArgumentException("Invalid brand: " + inputBrand);
        }
    }
}
