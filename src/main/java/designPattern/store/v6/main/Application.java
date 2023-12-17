package designPattern.store.v6.main;


import designPattern.store.v6.controller.StoreController;
import designPattern.store.v6.view.StoreView;

public class Application {
    public static void main(String[] args) {
        StoreView view = new StoreView();
        StoreController controller = new StoreController(view);
        controller.createAndDisplayStore();
    }
}
