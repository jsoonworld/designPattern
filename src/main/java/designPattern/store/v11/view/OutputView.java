package designPattern.store.v11.view;

import designPattern.store.v11.model.enums.StoreType;
import designPattern.store.v11.model.store.IStore;

public class OutputView {
    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayStoreDetails(IStore store, StoreType storeType, String brand) {
        displayMessage("\n====================== 상점 생성 결과 ======================");
        displayMessage("축하합니다! 당신의 " + storeType + " 상점이 성공적으로 생성되었습니다!");
        displayMessage("선택하신 브랜드: " + brand);
        displayMessage("\n상점 상세 정보:");
        displayMessage("계약 기간: " + store.getContractYears() + "년");
        displayMessage("상점 크기: " + store.getSize() + " 제곱미터");
        displayMessage("월세: 월 " + store.getRent() + "원");
        displayMessage("위치: " + store.getLocation());
        displayMessage("오픈 시간: " + store.getOpeningHours());
        displayMessage("===========================================================\n");
    }
}
