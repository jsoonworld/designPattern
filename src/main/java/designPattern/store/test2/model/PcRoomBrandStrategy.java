package designPattern.store.test2.model;

public class PcRoomBrandStrategy implements BrandStrategy {
    @Override
    public String selectBrand() {
        return "Challenger";
    }
}
