package designPattern.store.v10.controller;

import designPattern.store.v10.controller.selection.LocationSelectionController;
import designPattern.store.v10.model.enums.ContractYears;
import designPattern.store.v10.model.enums.RentAmount;
import designPattern.store.v10.model.enums.StoreSize;
import designPattern.store.v10.model.enums.StoreType;
import designPattern.store.v10.model.store.StoreCreationData;
import designPattern.store.v10.view.InputView;

public class StoreInputController {
    private InputView inputView;
    private LocationSelectionController locationSelectionController;

    public StoreInputController(InputView inputView, LocationSelectionController locationSelectionController) {
        this.inputView = inputView;
        this.locationSelectionController = locationSelectionController;
    }

    public StoreCreationData getStoreCreationData() {
        StoreType storeType = getStoreType();
        int contractYears = getContractYears().getYears();
        double size = getSize().getSize();
        double rent = getRent().getRent();
        String location = getLocation();

        return new StoreCreationData(storeType, contractYears, size, rent, location);
    }

    public StoreType getStoreType() {
        return StoreType.valueOf(inputView.getStoreTypeInput().toUpperCase());
    }

    public ContractYears getContractYears() {
        return ContractYears.valueOf(inputView.getContractYearsInput().toUpperCase());
    }

    public StoreSize getSize() {
        return StoreSize.valueOf(inputView.getSizeInput().toUpperCase());
    }

    public RentAmount getRent() {
        return RentAmount.valueOf(inputView.getRentInput().toUpperCase());
    }

    public String getLocation() {
        return locationSelectionController.selectLocation();
    }
}
