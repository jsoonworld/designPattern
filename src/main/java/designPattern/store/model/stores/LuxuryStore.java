package designPattern.store.model.stores;

import designPattern.store.items.Item;
import designPattern.store.model.interfaces.Store;
import designPattern.store.model.interfaces.DiscountStrategy;
import designPattern.store.model.strategies.NoDiscountStrategy;

import java.util.ArrayList;
import java.util.List;

public class LuxuryStore implements Store {
    private String name;
    private int capacity;
    private boolean isOpen;
    private List<String> waitingList;
    private DiscountStrategy discountStrategy;

    private int purchaseLimit = 1;

    public LuxuryStore(String name, int capacity, boolean isOpen) {
        this.name = name;
        this.capacity = capacity;
        this.isOpen = isOpen;
        this.waitingList = new ArrayList<>();
        this.discountStrategy = new NoDiscountStrategy();
    }

    // 상품 구매 메소드
    public boolean purchaseItem(Item item, int quantity) {
        if (quantity > purchaseLimit) {
            System.out.println("구매 제한 수량을 초과하였습니다: " + purchaseLimit + "개.");
            return false;
        }
        // 할인 전략을 적용하여 최종 가격 계산
        double finalPrice = discountStrategy.applyDiscount(item.getPrice() * quantity);
        System.out.println(item.getName() + " 상품을 " + finalPrice + "원에 구매하셨습니다.");
        return true;
    }

    // 할인 가능 여부 확인 메소드
    public boolean isSaleAllowed() {
        System.out.println("럭셔리 매장에서는 할인이 불가능합니다.");
        return false;
    }

    // 대기 목록에 추가 메소드
    public void addToWaitingList(String customerName) {
        waitingList.add(customerName);
    }

    @Override
    public void openStore() {
        
    }

    @Override
    public void closeStore() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getCapacity() {
        return 0;
    }

    @Override
    public boolean isOpen() {
        return false;
    }
}


