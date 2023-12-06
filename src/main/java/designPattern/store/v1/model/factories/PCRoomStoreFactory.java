package designPattern.store.v1.model.factories;

import designPattern.store.v1.model.interfaces.Store;
import designPattern.store.v1.model.stores.PCRoomStore;

public class PCRoomStoreFactory extends StoreFactory {
    @Override
    public Store createStore() {
        return new PCRoomStore("챌린저_PC방", 20, 1000.0);
    }
}

