package designPattern.store.model;

public class SportsStore extends Store {
    public SportsStore(String name, int capacity) {
        super(name, capacity);
    }

    public SportsStore() {
        super("나이키", 10);
    }
}
