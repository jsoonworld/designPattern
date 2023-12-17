package designPattern.store.v11.model.store;

import designPattern.store.v11.model.enums.StoreType;

public abstract class StoreDecorator implements IStore {
    protected IStore decoratedStore;

    public StoreDecorator(IStore decoratedStore) {
        this.decoratedStore = decoratedStore;
    }

    @Override
    public StoreType getStoreType() {
        return decoratedStore.getStoreType();
    }

    @Override
    public int getContractYears() {
        return decoratedStore.getContractYears();
    }

    @Override
    public double getSize() {
        return decoratedStore.getSize();
    }

    @Override
    public double getRent() {
        return decoratedStore.getRent();
    }

    @Override
    public String getLocation() {
        return decoratedStore.getLocation();
    }

    @Override
    public abstract String getOpeningHours(); // 구체적인 데코레이터 클래스에서 구현
}
