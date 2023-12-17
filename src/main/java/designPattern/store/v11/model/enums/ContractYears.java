package designPattern.store.v11.model.enums;

public enum ContractYears {
    ONE_YEAR(1),
    THREE_YEARS(3),
    FIVE_YEARS(5);

    private final int years;

    ContractYears(int years) {
        this.years = years;
    }

    public int getYears() {
        return this.years;
    }
}
