package designPattern.store.model;

public class SportsStore extends Store {
    public SportsStore(String name, int capacity, boolean isOpen) {
        super(name, capacity, isOpen);
    }

    public SportsStore() {
        super("나이키", 10, false  );
    }
}
