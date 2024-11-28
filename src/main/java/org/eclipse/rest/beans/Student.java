/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eclipse.rest.beans;

/**
 *
 * @author loickcherimont
 */
public class Student {

    private final String firstName, lastName;
    private final int age, id;

    public Student() {
        this.id = 0;
        this.firstName = "0 firstname";
        this.lastName = "0 lastname";
        this.age = 0;
    }

    public Student(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getID() {
        return id;
    }
}
