package designPattern.store.model.interfaces;


public interface Store {
    void openStore();
    void closeStore();
    String getName();
    int getCapacity();
    boolean isOpen();
}
