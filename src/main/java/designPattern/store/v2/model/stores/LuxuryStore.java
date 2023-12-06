package designPattern.store.v2.model.stores;

import designPattern.store.v2.model.interfaces.Store;

public class LuxuryStore implements Store {
    private String name;
    private int capacity;
    private int openingTime;
    private int closingTime;
    private boolean isOpen;

    public LuxuryStore(String name) {
        this.name = name;
        this.isOpen = false;
    }

    @Override
    public void openStore() {
        this.isOpen = true;
        System.out.println(name + " 매장이 오픈하였습니다. 오픈 시간: " + openingTime + "시, 수용 가능 인원: " + capacity + "명");
    }

    @Override
    public void closeStore() {
        this.isOpen = false;
        System.out.println(name + " 매장이 마감하였습니다. 마감 시간: " + closingTime + "시");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setOpeningTime(int openingTime) {
        this.openingTime = openingTime;
    }

    @Override
    public void setClosingTime(int closingTime) {
        this.closingTime = closingTime;
    }

    @Override
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // 매장 정보를 출력하는 메서드
    public void displayStoreInfo() {
        System.out.println("매장 이름: " + name);
        System.out.println("오픈 시간: " + openingTime + "시, 마감 시간: " + closingTime + "시");
        System.out.println("수용 가능 인원: " + capacity + "명");
        System.out.println("현재 상태: " + getStoreStatus());
    }

    private String getStoreStatus() {
        if (isOpen) {
            return "오픈";
        }
        return "마감";
    }

}
