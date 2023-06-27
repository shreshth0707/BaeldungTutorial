package com.phonepe.merchant.legion.tasks.utils.Baeldung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class ShallowCopy {

    @Test
    public void testShallowCopy() {
        Person john = new Person("John", 25);
        Person johnCopy = john;

        assertEquals("John", john.getName());
        assertEquals(25, john.getAge());
        assertEquals("John", johnCopy.getName());
        assertEquals(25, johnCopy.getAge());

        johnCopy.setName("John Doe");
        johnCopy.setAge(30);

        assertEquals("John Doe", john.getName());
        assertEquals(30, john.getAge());
        assertEquals("John Doe", johnCopy.getName());
        assertEquals(30, johnCopy.getAge());
    }
}
