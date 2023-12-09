package designPattern.store.test2.controller;

import designPattern.store.test2.model.Store;
import designPattern.store.test2.model.StoreType;
import designPattern.store.test2.view.OutputView;

public class StoreResultController {
    private OutputView outputView;

    public StoreResultController(OutputView outputView) {
        this.outputView = outputView;
    }

    public void displayStoreDetails(Store store, StoreType storeType, String brand) {
        outputView.displayMessage("Selected Brand: " + brand);
        outputView.displayMessage("Created a " + storeType + " store with the following details:");
        outputView.displayMessage("Contract Years: " + store.getContractYears());
        outputView.displayMessage("Size: " + store.getSize() + " sqm");
        outputView.displayMessage("Rent: " + store.getRent() + " per month");
        outputView.displayMessage("Location: " + store.getLocation());
    }
}
