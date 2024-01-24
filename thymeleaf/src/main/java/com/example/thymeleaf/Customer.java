package com.example.thymeleaf;

import jakarta.validation.constraints.*;

public class Customer {
    private String firstName;
    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    private String lastName;

    @NotNull(message = "is required")
    @Max(value = 10 , message = "must be less than 10 or 10")
    @Min(value = 0 , message = "must be greater than 0 or 0")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}",message = "Only 5 digits/characters")
    private String postalCode;

    public Customer(String firstName, String lastName, int freePasses, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.freePasses = freePasses;
        this.postalCode = postalCode;
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer(String firstName, String lastName, int freePasses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public Customer(){}
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public Integer getFreePasses() {
        return freePasses;
    }
    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}
