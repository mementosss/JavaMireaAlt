package Study_Java.Task13.z3.v2;

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
        StringTokenizer tokenizer = new StringTokenizer(addressString, ",.;");

        if (tokenizer.hasMoreTokens()) {
            country = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {
            region = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {
            city = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {
            street = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {
            house = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {
            building = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {
            flat = tokenizer.nextToken().trim();
        }
    }

    @Override
    public String toString() {
        return "Country: " + country + "\nRegion: " + region + "\nCity: " + city + "\nStreet: " + street + "\nHouse: " + house + "\nBuilding: " + building + "\nApartment: " + flat;
    }
}