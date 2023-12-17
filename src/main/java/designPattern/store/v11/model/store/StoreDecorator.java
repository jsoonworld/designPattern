package designPattern.store.v11.model.store;

public abstract class StoreDecorator extends Store{
    protected Store decoratedStore;

    public StoreDecorator(Store decoratedStore) {
        this.decoratedStore = decoratedStore;
    }

    public abstract String getOpeningHours();
}
