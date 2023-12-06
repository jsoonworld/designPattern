package designPattern.store.v1.model.interfaces;

import designPattern.store.v1.items.Item;

public interface StoreDecorator  {
    void addService();
    boolean purchaseItem(Item item, int quantity);
    boolean isSaleAllowed();
}
