package designPattern.store.v5.model;

public class SportsBrandStrategy implements BrandStrategy{
    @Override
    public String selectBrand() {
        return "Nike";
    }
}
