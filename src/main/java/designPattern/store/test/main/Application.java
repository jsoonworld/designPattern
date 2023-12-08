package designPattern.store.test.main;


import designPattern.store.test.controller.StoreController;
import designPattern.store.test.view.StoreView;

public class Application {
    public static void main(String[] args) {
        StoreView view = new StoreView();
        StoreController controller = new StoreController(view);
        controller.createAndDisplayStore();
    }
}
