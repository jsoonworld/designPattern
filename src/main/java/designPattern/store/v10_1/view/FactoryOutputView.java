package designPattern.store.v10_1.view;

import designPattern.store.v10_1.model.enums.StoreType;

public class FactoryOutputView {
    
    public void selectStoreType() {
        System.out.println("생성하실 매장의 종류를 선택해 주세요.");

        StoreType[] storeTypes = StoreType.values();

        int i = 1;
        for (StoreType storeType : storeTypes) {
            System.out.print(i + ". " + storeType.name() + "  ");
            i++;
        }

        System.out.println();
    }

    public void inputStoreName() {
        System.out.println("생성하실 매장의 이름을 작성해주세요.");
    }
}
