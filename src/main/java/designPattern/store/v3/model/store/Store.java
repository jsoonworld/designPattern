package designPattern.store.v3.model.store;

public interface Store {

    void displayStoreInfo();
    void setOperatingHours(String openingTime, String closingTime);
    String getOperatingHours();

    ContractYear getContractYear();

    Size getSize();

    Rent getRent();

    Location getLocation();
}
