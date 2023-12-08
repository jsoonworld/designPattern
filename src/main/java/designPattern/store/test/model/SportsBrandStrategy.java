package designPattern.store.test.model;

public class SportsBrandStrategy implements BrandStrategy {
    @Override
    public String selectBrand() {
        return "Nike";
    }
}
