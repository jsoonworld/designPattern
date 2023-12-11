package designPattern.store.v10_1.view;

import designPattern.store.v10_1.model.enums.StoreType;

public class FactoryOutputView {
    
    public void selectStoreType() {
        System.out.println("생성하실 매장의 종류를 \"숫자로\" 선택해 주세요.");

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

    // 입력 오류 발생 시 출력
    public void displayInputErrorMessage() {
        System.out.println("입력 형식이 잘못되었습니다. 다시 시도하세요.");
    }
}
