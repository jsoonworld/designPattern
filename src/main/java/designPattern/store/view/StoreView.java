package designPattern.store.view;

import designPattern.store.model.Store;

public class StoreView {
    public void displayStoreInfo(Store store) {
        System.out.println("상점 이름: " + store.getName());
        System.out.println("상점 크기: " + store.getCapacity());
    }
}
