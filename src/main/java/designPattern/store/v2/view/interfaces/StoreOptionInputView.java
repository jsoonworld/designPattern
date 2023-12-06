package designPattern.store.v2.view.interfaces;

public interface StoreOptionInputView {
    String receiveStoreName();
    int receiveOpeningTime();
    int receiveClosingTime();
    int receiveCapacity();
    void closeScanner();
}
