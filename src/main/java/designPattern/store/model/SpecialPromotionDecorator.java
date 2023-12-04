package designPattern.store.model;

public class SpecialPromotionDecorator implements StoreDecorator{
    private Store store;

    public SpecialPromotionDecorator(Store store) {
        this.store = store;
    }


    @Override
    public void addService() {
        // TODO : 특별 프로모션 추가 로직
    }
}
