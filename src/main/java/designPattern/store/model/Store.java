package designPattern.store.model;


public class Store {
    private String name;
    private int capacity;
    private boolean isOpen;

    public Store(String name, int capacity, boolean isOpen) {
        this.name = name;
        this.capacity = capacity;
        this.isOpen = false;
    }

    // TODO : 매장에 맞게 오픈, 마감 시간 적용.
    public void openStore() {
        isOpen = true;
    }

    public void closeStore() {
        isOpen = false;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isOpen() {
        return isOpen;
    }
}
