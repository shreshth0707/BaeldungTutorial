package com.phonepe.merchant.legion.tasks.utils.Baeldung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Address {
    private String street;

    public Address(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}

class People {
    private String name;
    private Address address;

    public People(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

public class DeepCopy {

    @Test
    public void testDeepCopy() {
        Address address = new Address("123 Main St");
        People john = new People("John", address);
        People johnCopy = new People(john.getName(), new Address(john.getAddress().getStreet()));

        assertEquals("John", john.getName());
        assertEquals("123 Main St", john.getAddress().getStreet());
        assertEquals("John", johnCopy.getName());
        assertEquals("123 Main St", johnCopy.getAddress().getStreet());

        johnCopy.setName("John Doe");
        johnCopy.getAddress().setStreet("456 Elm St");

        assertEquals("John", john.getName());
        assertEquals("123 Main St", john.getAddress().getStreet());
        assertEquals("John Doe", johnCopy.getName());
        assertEquals("456 Elm St", johnCopy.getAddress().getStreet());
    }
}
