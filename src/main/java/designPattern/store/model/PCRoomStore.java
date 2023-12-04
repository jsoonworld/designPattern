package designPattern.store.model;

public class PCRoomStore extends Store {
    public PCRoomStore(String name, int capacity) {
        super(name, capacity);
    }

    public PCRoomStore() {
        super("챌린저_PC방", 20);
    }
}
