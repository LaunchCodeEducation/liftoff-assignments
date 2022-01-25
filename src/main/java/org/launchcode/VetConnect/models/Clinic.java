package org.launchcode.VetConnect.models;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Clinic extends AbstractEntity{

    private String name;
    private String number;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String website;

    public Clinic() {}

//    Initialize the id and value fields
    public Clinic(String name, String number, String address, String city, String state, String zip, String website) {
        super();
        this.name = name;
        this.number = number;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.website = website;
    }

//    Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

}
