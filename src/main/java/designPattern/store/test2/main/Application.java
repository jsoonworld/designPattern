package designPattern.store.test2.main;

import designPattern.store.test2.model.Store;
import designPattern.store.test2.view.InputView;
import designPattern.store.test2.view.OutputView;
import designPattern.store.test2.controller.BrandSelectionController;
import designPattern.store.test2.controller.StoreCreationController;
import designPattern.store.test2.model.StoreType;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class Application {
    private static final Map<StoreType, String[]> BRAND_OPTIONS = new HashMap<>();
    private static final String[] LOCATION_OPTIONS = {"성수", "신사", "홍대"};


    static {
        BRAND_OPTIONS.put(StoreType.LUXURY, new String[]{"Hermes", "Louis Vuitton", "Chanel"});
        BRAND_OPTIONS.put(StoreType.SPORTS, new String[]{"Nike", "Adidas", "Under Armour"});
        BRAND_OPTIONS.put(StoreType.PC_ROOM, new String[]{"Challenger", "Master", "Diamond"});
    }

    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        StoreCreationController storeCreationController = new StoreCreationController(inputView, outputView);
        BrandSelectionController brandSelectionController = new BrandSelectionController();

        // 매장 유형 및 속성 입력 받기
        StoreType storeType = StoreType.valueOf(inputView.getInput("Enter store type (LUXURY, SPORTS, PC_ROOM): ").toUpperCase());
        int contractYears = Integer.parseInt(inputView.getInput("Enter contract years: "));
        double size = Double.parseDouble(inputView.getInput("Enter size (sqm): "));
        double rent = Double.parseDouble(inputView.getInput("Enter rent: "));
        System.out.println("Available locations: 성수, 신사, 홍대");
        String location = inputView.getInput("Enter location: ");


        // 매장 생성
        Store store = storeCreationController.createStore(storeType, contractYears, size, rent, location);

        // 사용 가능한 브랜드 목록 표시 및 브랜드 선택을 위한 사용자 입력 받기
        StringJoiner brandOptions = new StringJoiner(", ");
        for (String brand : BRAND_OPTIONS.get(storeType)) {
            brandOptions.add(brand);
        }
        String brandChoice = inputView.getInput("Available brands: " + brandOptions.toString() + "\nEnter brand name: ");

        // 브랜드 선택
        String brand = brandSelectionController.selectBrand(storeType, brandChoice);

        // 결과 출력
        outputView.displayMessage("Selected Brand: " + brand);
        outputView.displayMessage("Created a " + storeType + " store with the following details:");
        outputView.displayMessage("Contract Years: " + store.getContractYears());
        outputView.displayMessage("Size: " + store.getSize() + " sqm");
        outputView.displayMessage("Rent: " + store.getRent() + " per month");
        outputView.displayMessage("Location: " + store.getLocation());
    }
}
