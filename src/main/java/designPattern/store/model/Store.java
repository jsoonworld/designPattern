package designPattern.store.model;


public class Store {
    private String name;
    private int capacity;

    public Store(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
