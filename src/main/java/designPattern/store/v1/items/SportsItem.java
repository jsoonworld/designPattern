package designPattern.store.v1.items;

public class SportsItem extends Item {
    private String sportType;

    public SportsItem(String id, String name, double price, String sportType) {
        super(id, name, price);
        this.sportType = sportType;
    }

    public String getSportType() { return sportType; }

}
