package designPattern.store.test2.main;


import designPattern.store.test2.model.Store;
import designPattern.store.test2.view.StoreView;
import designPattern.store.test2.controller.BrandSelectionController;
import designPattern.store.test2.controller.StoreCreationController;
import designPattern.store.test2.model.StoreType;

public class Application {
    public static void main(String[] args) {
        StoreView view = new StoreView();
        StoreCreationController storeCreationController = new StoreCreationController(view);
        BrandSelectionController brandSelectionController = new BrandSelectionController();

        // 매장 유형 및 속성 입력 받기
        StoreType storeType = StoreType.valueOf(view.getInput("Enter store type (LUXURY, SPORTS, PC_ROOM): ").toUpperCase());
        int contractYears = Integer.parseInt(view.getInput("Enter contract years: "));
        double size = Double.parseDouble(view.getInput("Enter size (sqm): "));
        double rent = Double.parseDouble(view.getInput("Enter rent: "));
        String location = view.getInput("Enter location: ");

        // 매장 생성 및 브랜드 선택
        Store store = storeCreationController.createStore(storeType, contractYears, size, rent, location);
        String brand = brandSelectionController.selectBrand(storeType);

        // 결과 출력
        view.displayMessage("Selected Brand: " + brand);
        view.displayMessage("Created a " + storeType + " store with the following details:");
        view.displayMessage("Contract Years: " + store.getContractYears());
        view.displayMessage("Size: " + store.getSize() + " sqm");
        view.displayMessage("Rent: " + store.getRent() + " per month");
        view.displayMessage("Location: " + store.getLocation());
    }
}
