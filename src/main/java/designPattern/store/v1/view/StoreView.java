package designPattern.store.v1.view;

import designPattern.store.v1.model.interfaces.Store;

public class StoreView {
    public void displayStoreInfo(Store store) {
        System.out.println("Store Name: " + store.getName());
        System.out.println("Capacity: " + store.getCapacity());

        String openStatus = "No";
        if (store.isOpen()) {
            openStatus = "Yes";
        }
        System.out.println("Open: " + openStatus);
    }
}
