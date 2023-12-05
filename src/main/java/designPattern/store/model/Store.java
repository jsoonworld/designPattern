package designPattern.store.model;


public interface Store {
    void openStore();
    void closeStore();
    String getName();
    int getCapacity();
    boolean isOpen();
}
