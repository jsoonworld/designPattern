package designPattern.store;

import designPattern.store.controller.StoreController;
import designPattern.store.model.factories.LuxuryStoreFactory;
import designPattern.store.model.factories.PCRoomStoreFactory;
import designPattern.store.model.factories.SportsStoreFactory;
import designPattern.store.model.factories.StoreFactory;
import designPattern.store.model.interfaces.Store;
import designPattern.store.view.StoreView;

public class Main {
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