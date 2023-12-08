package designPattern.store.v1.items;

public class LuxuryItem extends Item{

    private boolean isLimitedEdition;

    public LuxuryItem(String id, String name, double price, boolean isLimitedEdition) {
        super(id, name, price);
        this.isLimitedEdition = isLimitedEdition;
    }

    public boolean isLimitedEdition() { return isLimitedEdition; }

}
