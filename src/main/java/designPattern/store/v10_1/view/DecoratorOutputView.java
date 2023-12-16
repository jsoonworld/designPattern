package designPattern.store.v10_1.view;

import java.util.Map;

import designPattern.store.v10_1.model.Store;
import designPattern.store.v10_1.model.StoreManager;
import designPattern.store.v10_1.model.decorator.LuxuryStoreDecorator;

public class DecoratorOutputView {
    private StoreManager storeManager;
    private Store store;

    public void setDecoratorOutputView(Store store) {
        this.store = store;
    }

    public void displayStoreList(StoreManager storeManager) {
        this.storeManager = storeManager;

        System.out.println();
        System.out.println("현재 Store 목록은 다음과 같습니다.");
        storeManager.printAllStoreNamesAndTypes();
        System.out.println();
    }

    public void selectStore() {
        System.out.println("관리하실 매장을 선택해 주세요.");
    }

    public void selectedStore(int select) {
        String storeNameandType = selectedStoreName(select);
        System.out.println("\n" + storeNameandType + "을(를) 선택하셨습니다.\n");
    }

    private String selectedStoreName(int select) {
        Map<String, Store> allStores = storeManager.getAllStores();

        int count = 1;
        for (Map.Entry<String, Store> entry : allStores.entrySet()) {
            if (count == select) {
                String storeName = entry.getKey();
                Store store = entry.getValue();
                return storeName + " (" + store.getStoreType() + ")";
            }
            count++;
        }

        // 선택된 번호에 해당하는 매장이 없는 경우, 기본 값이나 오류 메시지를 반환
        return "No store found for the selected number: " + select;
    }

    public void displayStoreOutput() {
        System.out.println("현재 Store 정보는 다음과 같습니다.");
        displayStoreInfo();
        displayStoreFeature();
    }

    private void displayStoreInfo() {
        store.operate();
    }

    private void displayStoreFeature() {
        if (store instanceof LuxuryStoreDecorator) {
            LuxuryStoreDecorator luxuryStore = (LuxuryStoreDecorator) store;
            // 여기에 럭셔리 스토어에 특화된 추가 정보를 출력하는 코드를 넣을 수 있습니다.
        }
    }
}
