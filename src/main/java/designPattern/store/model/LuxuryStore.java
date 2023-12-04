package designPattern.store.model;

public class LuxuryStore extends Store {
    public LuxuryStore(String name, int capacity) {
        super(name, capacity);
    }

    public LuxuryStore() {
        super("에르메스", 5);
    }
}
