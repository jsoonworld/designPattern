package designPattern.store.model.factories;

import designPattern.store.model.interfaces.Store;
import designPattern.store.model.stores.PCRoomStore;

public class PCRoomStoreFactory extends StoreFactory {
    @Override
    public Store createStore() {
        return new PCRoomStore("챌린저_PC방", 20, false);
    }
}
