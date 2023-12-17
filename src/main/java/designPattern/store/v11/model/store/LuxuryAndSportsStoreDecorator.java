package designPattern.store.v11.model.store;

public class LuxuryAndSportsStoreDecorator extends StoreDecorator {
    public LuxuryAndSportsStoreDecorator(Store decoratedStore) {
        super(decoratedStore);
    }

    @Override
    public String getOpeningHours() {
        return "9 AM - 9 PM";
    }
}
