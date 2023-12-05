package designPattern.store.model;

import java.util.ArrayList;
import java.util.List;

public class LuxuryStore implements Store {
    private String name;
    private int capacity;
    private boolean isOpen;
    private List<String> waitingList;

    public LuxuryStore(String name, int capacity, boolean isOpen) {
        this.name = name;
        this.capacity = capacity;
        this.isOpen = isOpen;
        this.waitingList = new ArrayList<>();
    }

    public void addToWaitingList(String customerName) {
        waitingList.add(customerName);
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
}

