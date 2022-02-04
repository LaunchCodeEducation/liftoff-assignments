package org.launchcode.VetConnect.models.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class RegisterFormDTO {

    @NotBlank(message="Please choose a user type.")
    private String userType;

    @NotBlank(message="First name must not be blank.")
    private String firstName;

    @NotBlank(message="Last name must not be blank.")
    private String lastName;

    @NotBlank(message="Email must not be blank.")
    @Email(message="Enter a valid email address.")
    private String emailAddress;

    @NotBlank(message="Password must not be blank.")
    @Size(min = 5, max = 30, message = "Password must be " +
            "between 5 and 30 characters.")
    private String password;

    private String verifyPassword;

    // getters

    public String getUserType() {
        return userType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

}
