package designPattern.store.v8.view;

import designPattern.store.v8.model.Store;
import designPattern.store.v8.model.StoreType;

public class OutputView {
    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayStoreDetails(Store store, StoreType storeType, String brand) {
        displayMessage("Selected Brand: " + brand);
        displayMessage("Created a " + storeType + " store with the following details:");
        displayMessage("Contract Years: " + store.getContractYears());
        displayMessage("Size: " + store.getSize() + " sqm");
        displayMessage("Rent: " + store.getRent() + " per month");
        displayMessage("Location: " + store.getLocation());
    }
}
