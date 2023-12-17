package designPattern.store.v6.model;

public class PcRoomBrandStrategy implements BrandStrategy {
    @Override
    public String selectBrand() {
        return "Challenger";
    }
}
