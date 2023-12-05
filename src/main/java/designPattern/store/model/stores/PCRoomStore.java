package designPattern.store.model.stores;

import designPattern.store.model.interfaces.Store;

public class PCRoomStore implements Store {
    private String name;
    private int capacity;
    private boolean isOpen;

    public PCRoomStore(String name, int capacity, boolean isOpen) {
        this.name = name;
        this.capacity = capacity;
        this.isOpen = isOpen;
    }

    public void useComputer(int hours) {
        System.out.println("컴퓨터를 " + hours + "시간 사용합니다.");

    }

    public void orderFood() {
        System.out.println("음식을 주문합니다.");
    }

    @Override
    public void openStore() {
        isOpen = true;
        // 추가적인 오픈 로직...
    }

    @Override
    public void closeStore() {
        isOpen = false;
        // 추가적인 마감 로직...
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public boolean isOpen() {
        return isOpen;
    }

    // ... 기타 필요한 메서드들...
}

