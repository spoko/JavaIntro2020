package oop;

public class Address {
    private String city;
    private String streetName;
    private int postalCode;

    public Address (String city, String streetName, int postalCode){
        setCity(city);
        setStreetName(streetName);
        setPostalCode(postalCode);
    }

    public String getCity() {
        return city;
    }

    private void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    private void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getPostalCode() {
        return postalCode;
    }

    private void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String toString(){
        return String.format("City is %s, street is %s and postal code is %d", city, getStreetName(),
                getPostalCode());
    }
}
