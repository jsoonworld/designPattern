package designPattern.store.v3.model;

public enum ContractYear {
    THREE(3), FIVE(5), TEN(10);

    private final int years;

    ContractYear(int years) {
        this.years = years;
    }

    public int getYears() {
        return years;
    }
}