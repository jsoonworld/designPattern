package designPattern.store.v11.model.store;

import designPattern.store.v11.model.enums.StoreType;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Store implements IStore {
    private StoreType storeType;
    private int contractYears;
    private double size;
    private double rent;
    private String location;

    // Store 클래스 생성자 및 기타 메서드

    @Override
    public String getOpeningHours() {
        return "Default Opening Hours";
    }
}
