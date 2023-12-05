package designPattern.store.items;

public class PCfoodItem extends Item {
    private String FoodType;

    public PCfoodItem(String id, String name, double price, String FoodType) {
        super(id, name, price);
        this.FoodType = FoodType;
    }

    public String getFoodType() {return FoodType; }
    
}
