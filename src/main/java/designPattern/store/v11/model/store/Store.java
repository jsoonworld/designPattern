package designPattern.store.v11.model.store;

import designPattern.store.v11.model.enums.StoreType;
import lombok.Builder;
import lombok.Getter;

@Getter
public class Store {
    private StoreType storeType;
    private int contractYears;
    private double size;
    private double rent;
    private String location;

    @Builder
    private Store(StoreType storeType, int contractYears, double size, double rent, String location) {
        this.storeType = storeType;
        this.contractYears = contractYears;
        this.size = size;
        this.rent = rent;
        this.location = location;
    }
}
