package designPattern.store.v8.model;

import java.util.Arrays;
import java.util.List;

public class PcRoomBrandStrategy implements BrandStrategy {
    private static final List<String> PC_ROOM_BRANDS = Arrays.asList("Challenger", "Master", "Diamond");

    @Override
    public String selectBrand(String inputBrand) {
        if (PC_ROOM_BRANDS.contains(inputBrand)) {
            return inputBrand;
        } else {
            throw new IllegalArgumentException("Invalid brand: " + inputBrand);
        }
    }
}
