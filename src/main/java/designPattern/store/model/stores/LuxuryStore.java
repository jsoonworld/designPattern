package designPattern.store.model.stores;

import designPattern.store.model.interfaces.Store;

import java.util.ArrayList;
import java.util.List;

public class LuxuryStore implements Store {
    private String name;
    private int capacity;
    private boolean isOpen;
    private List<String> waitingList;

    private int purchaseLimit = 1;
    private final boolean salePolicy = false;


    public LuxuryStore(String name, int capacity, boolean isOpen) {
        this.name = name;
        this.capacity = capacity;
        this.isOpen = isOpen;
        this.waitingList = new ArrayList<>();
    }

    public boolean purchaseItem(Item item, int quantity) {
        if (quantity > purchaseLimit) {
            System.out.println("구매 제한 수량을 초과하였습니다.");
            return false;
        }
        
        return true;
    }

    public boolean isSaleAllowed() {
        return salePolicy;
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

