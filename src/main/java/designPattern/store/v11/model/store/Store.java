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
        // 기본 Store 클래스에서의 오픈 시간 구현 (필요한 경우)
        return "Default Opening Hours";
    }
}
