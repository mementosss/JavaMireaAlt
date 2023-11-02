package Study_Java.Task13.z3.v1;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String flat;

    public Address(String addressString) {
            String[] parts = addressString.split(",");
            if (parts.length >= 7) {
                country = parts[0].trim();
                region = parts[1].trim();
                city = parts[2].trim();
                street = parts[3].trim();
                house = parts[4].trim();
                building = parts[5].trim();
                flat = parts[6].trim();
            }
        }

    @Override
    public String toString() {
        return "Country: " + country + "\nRegion: " + region + "\nCity: " + city + "\nStreet: " + street + "\nHouse: " + house + "\nBuilding: " + building + "\nApartment: " + flat;
    }
}