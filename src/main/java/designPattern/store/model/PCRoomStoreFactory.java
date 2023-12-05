package designPattern.store.model;

public class PCRoomStoreFactory extends StoreFactory {
    @Override
    public Store createStore() {
        return new PCRoomStore("챌린저_PC방", 20, false);
    }
}
