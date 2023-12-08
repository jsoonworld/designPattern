package designPattern.store;


import designPattern.store.v4.contoller.StoreController;
import designPattern.store.v4.model.Store;

public class Application {
    public static void main(String[] args) {
        StoreController controller = new StoreController();

        // "luxury" 등의 매장 타입 입력 받기
        Store store = controller.setupStore("luxury");
        store.displayStoreInfo();
    }
}