package com.example.springboot_assignment;



public class UserDetail {

    private static String firstName;
    private static String lastName;
    private static String email;
    private String id;

    public static String getEmail() {
        return email;
    }

    public static String getFirstName() {
        return firstName;
    }

    public String getId() {
        return id;
    }

    public static String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
