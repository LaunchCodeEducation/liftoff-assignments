package org.launchcode.VetConnect.models.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoginFormDTO {

    @NotBlank(message="Email must not be blank.")
    @Email(message="Enter a valid email address.")
    private String emailAddress;

    @NotBlank(message="Password must not be blank.")
    @Size(min = 5, max = 30, message = "Password must be " +
            "between 5 and 30 characters.")
    private String password;

    // getters

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassword() {
        return password;
    }

    // setters

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
