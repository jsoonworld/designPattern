package designPattern.store.model.interfaces;

import designPattern.store.items.Item;

public interface StoreDecorator  {
    void addService();
    boolean purchaseItem(Item item, int quantity);
    boolean isSaleAllowed();
}
