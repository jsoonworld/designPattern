package designPattern.store.v4.model;

public interface Store {
    void setContractYear(ContractYear contractYear);
    void setSize(Size size);
    void setRent(Rent rent);
    void setLocation(Location location);

    ContractYear getContractYear();
    Size getSize();
    Rent getRent();
    Location getLocation();

    void displayStoreInfo();
}
