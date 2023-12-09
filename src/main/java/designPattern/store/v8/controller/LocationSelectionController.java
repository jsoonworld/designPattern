package designPattern.store.v8.controller;

import designPattern.store.v8.view.InputView;

public class LocationSelectionController {
    private static final String[] LOCATION_OPTIONS = {"성수", "신사", "홍대"};
    private final InputView inputView;

    public LocationSelectionController(InputView inputView) {
        this.inputView = inputView;
    }

    public String selectLocation() {
        System.out.println("Available locations: 성수, 신사, 홍대");
        return inputView.getInput("Enter location: ");
    }
}

