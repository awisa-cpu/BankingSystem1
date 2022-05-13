package services;

public class Address {
    private String address1;
    private String address2;
    private String town;
    private String state;
    private String country;

    public Address(String address1, String address2, String town, String state, String country) {
        this.address1 = address1;
        this.address2 = address2;
        this.town = town;
        this.state = state;
        this.country = country;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
