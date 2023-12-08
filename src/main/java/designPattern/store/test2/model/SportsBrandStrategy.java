package designPattern.store.test2.model;

public class SportsBrandStrategy implements BrandStrategy {
    @Override
    public String selectBrand() {
        return "Nike";
    }
}
