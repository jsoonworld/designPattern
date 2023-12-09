package designPattern.store.v6.model;

public class SportsBrandStrategy implements BrandStrategy {
    @Override
    public String selectBrand() {
        return "Nike";
    }
}
