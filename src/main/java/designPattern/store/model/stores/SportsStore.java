package designPattern.store.model.stores;

import designPattern.store.items.Item;
import designPattern.store.model.interfaces.DiscountStrategy;
import designPattern.store.model.interfaces.Store;

import java.util.HashMap;
import java.util.Map;

public class SportsStore implements Store {
    private String name;
    private int capacity;
    private boolean isOpen;
    private DiscountStrategy discountStrategy;
    private Map<String, Item> inventory; // 가게의 재고를 나타냅니다.

    public SportsStore(String name, int capacity, DiscountStrategy discountStrategy) {
        this.name = name;
        this.capacity = capacity;
        this.isOpen = false; // 기본적으로 가게는 닫힌 상태입니다.
        this.discountStrategy = discountStrategy;
        this.inventory = new HashMap<>();
    }

    // 아이템 구매
    public boolean purchaseItem(Item item, int quantity) {
        // 재고 확인 로직 (여기서는 단순화하여 재고 체크를 생략합니다)

        // 할인 로직 적용
        double discountedPrice = discountStrategy.applyDiscount(item.getPrice()) * quantity;
        System.out.println(item.getName() + " 상품을 " + discountedPrice + "원에 구매하셨습니다.");

        // 재고 업데이트 로직 (여기서는 단순화하여 재고 업데이트를 생략합니다)

        return true;
    }

    // 할인 가능 여부
    public boolean isSaleAllowed() {
        return true; // 스포츠 매장에서는 할인이 가능합니다.
    }

    // 재고 아이템 추가
    public void addItemToInventory(Item item) {
        inventory.put(item.getId(), item);
    }

    // 가게 개점
    @Override
    public void openStore() {
        isOpen = true;
        System.out.println(name + " 매장이 열렸습니다.");
    }

    // 가게 폐점
    @Override
    public void closeStore() {
        isOpen = false;
        System.out.println(name + " 매장이 닫혔습니다.");
    }

    // Getter 메소드들
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
