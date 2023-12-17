package designPattern.store.v10_1.model.factories;

import designPattern.store.v10_1.model.BasicStore;
import designPattern.store.v10_1.model.Store;
import designPattern.store.v10_1.model.decorator.SportStoreDecorator;
import designPattern.store.v10_1.model.enums.StoreType;

public class SportStoreFactory extends StoreFactory {
    
    @Override
    public Store createStore(String storeName) {
        Store store = new BasicStore(storeName, StoreType.SPORT);
        return new SportStoreDecorator(store, storeName); 
    }

}
