package designPattern.store.v5.model;

public class LuxuryBrandStrategy implements BrandStrategy{
    @Override
    public String selectBrand() {
        return "Hermes";
    }
}
