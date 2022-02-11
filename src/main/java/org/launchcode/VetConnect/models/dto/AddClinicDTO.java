package org.launchcode.VetConnect.models.dto;

import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.NotBlank;

public class AddClinicDTO {

    @NotBlank(message = "Name required")
    private String name;

    @NotBlank(message = "Address required")
    private String address;

    @NotBlank(message = "City required")
    private String city;

    @NotBlank(message = "State required")
    private String state;

    @NotBlank(message = "Zip required")
    @NumberFormat
    private String zip;

    @NotBlank(message = "Phone Number required")
    @NumberFormat
    private String number;

    @NotBlank(message = "Website required")
    private String website;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
