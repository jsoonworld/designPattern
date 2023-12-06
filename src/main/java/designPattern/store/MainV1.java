package designPattern.store;

import designPattern.store.v1.controller.StoreController;
import designPattern.store.v1.model.factories.LuxuryStoreFactory;
import designPattern.store.v1.model.factories.PCRoomStoreFactory;
import designPattern.store.v1.model.factories.SportsStoreFactory;
import designPattern.store.v1.model.factories.StoreFactory;
import designPattern.store.v1.model.interfaces.Store;
import designPattern.store.v1.view.StoreView;

public class MainV1 {
    public static void main(String[] args) {

        StoreFactory luxuryStoreFactory = new LuxuryStoreFactory();
        StoreFactory pcRoomStoreFactory = new PCRoomStoreFactory();
        StoreFactory sportsStoreFactory = new SportsStoreFactory();

        Store luxuryStore = luxuryStoreFactory.createStore();
        Store pcRoomStore = pcRoomStoreFactory.createStore();
        Store sportsStore = sportsStoreFactory.createStore();

        StoreView view = new StoreView();
        StoreController luxuryStoreController = new StoreController(luxuryStore, view);
        StoreController pcRoomStoreController = new StoreController(pcRoomStore, view);
        StoreController sportsStoreController = new StoreController(sportsStore, view);

        luxuryStoreController.openStore();
        pcRoomStoreController.openStore();
        sportsStoreController.openStore();

    }
}
