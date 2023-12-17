package designPattern.store.v11.model.store;

public class PcRoomStoreDecorator extends StoreDecorator {
    public PcRoomStoreDecorator(IStore decoratedStore) {
        super(decoratedStore);
    }

    @Override
    public String getOpeningHours() {
        return "24/7 Open";
    }
}
