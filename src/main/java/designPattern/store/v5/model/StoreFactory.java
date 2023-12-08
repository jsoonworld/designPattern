package designPattern.store.v5.model;

public abstract class StoreFactory {
    public abstract Store createStore();

    public static StoreFactory getFactory(StoreType type) {
        switch (type) {
            case LUXURY:
                return new LuxuryStoreFactory();
            case SPORTS:
                return new SportsStoreFactory();
            case PC_ROOM:
                return new PcRoomStoreFactory();
            default:
                throw new IllegalArgumentException("Invalid store type");
        }
    }
}
