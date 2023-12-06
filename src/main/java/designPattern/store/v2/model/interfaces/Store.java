package designPattern.store.v2.model.interfaces;

public interface Store {
    void openStore();
    void closeStore();
    String getName();
    void setOpeningTime(int openingTime);
    void setClosingTime(int closingTime);
    void setCapacity(int capacity);
}
