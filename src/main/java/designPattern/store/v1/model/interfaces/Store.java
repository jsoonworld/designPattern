package designPattern.store.v1.model.interfaces;


public interface Store {
    void openStore();
    void closeStore();
    String getName();
    int getCapacity();
    boolean isOpen();
}
