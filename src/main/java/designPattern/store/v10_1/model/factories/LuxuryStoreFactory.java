package designPattern.store.v10_1.model.factories;

import designPattern.store.v10_1.model.BasicStore;
import designPattern.store.v10_1.model.Store;
import designPattern.store.v10_1.model.decorator.LuxuryStoreDecorator;

public class LuxuryStoreFactory extends StoreFactory {
    
    @Override
    public Store createStore(String storeName) {
        Store store = new BasicStore(); 
        return new LuxuryStoreDecorator(store); 
    }

}
