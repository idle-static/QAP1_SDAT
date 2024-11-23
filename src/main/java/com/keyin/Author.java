package com.keyin;

public class Author {
    private final String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName=" + firstName + '\'' +
                ", lastName=" + lastName + '\'' +
                '}';
    }
}
