package designPattern.store.v5.model;

public class PcRoomBrandStrategy implements BrandStrategy{
    @Override
    public String selectBrand() {
        return "Challenger";
    }
}
