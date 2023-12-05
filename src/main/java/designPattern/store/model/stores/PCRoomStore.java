package designPattern.store.model.stores;

import designPattern.store.model.interfaces.Store;

public class PCRoomStore implements Store {
    private String name;
    private int capacity;
    private boolean isOpen;

    private double balance; // 사용자의 충전 금액
    private final double hourlyRate; // 시간당 요금
    private int currentCustomers; // 현재 고객 수

    public PCRoomStore(String name, int capacity, double hourlyRate) {
        this.name = name;
        this.capacity = capacity;
        this.hourlyRate = hourlyRate;
        this.isOpen = false;
        this.balance = 0;
        this.currentCustomers = 0;
    }

    public void addBalance(double amount) {
        balance += amount;
    }

    public boolean enterCustomer() {
        if (currentCustomers < capacity) {
            currentCustomers++;
            return true;
        }
        return false; // 수용 인원이 가득 찼을 때
    }

    public void leaveCustomer() {
        if (currentCustomers > 0) {
            currentCustomers--;
        }
    }

    public void useComputer(int hours) {
        double cost = hours * hourlyRate;
        if (balance >= cost) {
            balance -= cost;
            System.out.println(hours + "시간 동안 컴퓨터를 사용합니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
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

}

