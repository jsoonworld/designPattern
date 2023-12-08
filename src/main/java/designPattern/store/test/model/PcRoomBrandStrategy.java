package designPattern.store.test.model;

public class PcRoomBrandStrategy implements BrandStrategy {
    @Override
    public String selectBrand() {
        return "Challenger";
    }
}
