package designPattern.store.model;

import java.util.ArrayList;
import java.util.List;

public class LuxuryStore extends Store {
    private List<String> waitingList;
    public LuxuryStore(String name, int capacity) {
        super(name, capacity, false);
        this.waitingList = new ArrayList<>();
    }

    public void addToWaitingList(String customerName) {
        waitingList.add(customerName);
    }

    public LuxuryStore() {
        super("에르메스", 5, false);
    }
}
