package designPattern.store.model;

public class PCRoomStore extends Store {
    public PCRoomStore(String name, int capacity,boolean isOpen) {
        super(name, capacity, isOpen);
    }

    public PCRoomStore() {
        super("챌린저_PC방", 20, false);
    }
}
