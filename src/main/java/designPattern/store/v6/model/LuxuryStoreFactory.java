package designPattern.store.v6.model;

public class LuxuryStoreFactory extends StoreFactory {

    @Override
    public Store createStore(Store.StoreBuilder builder) {
        // 기존에 고정된 값을 사용하는 대신, builder에서 제공하는 값을 사용
        return builder.build();
    }
}
