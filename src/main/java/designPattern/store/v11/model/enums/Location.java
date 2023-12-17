package designPattern.store.v11.model.enums;

public enum Location {
    SEONGSU("Seongsu"),
    SINSADONG("Sinsa"),
    HONGDAE("Hongdae");

    private final String displayName;

    Location(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return this.displayName;
    }
}
