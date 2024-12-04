/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eclipse.rest.data;

import java.util.HashMap;
import org.eclipse.rest.beans.Student;

/**
 *
 * @author loickcherimont
 */

// TODO : handle errors

public class Students {

    private static HashMap<Integer, Student> all;

    // Create an Hash Map of students
    public static void generateAll() {
        HashMap<Integer, Student> students = new HashMap<>();
        students.put(1, new Student(1, "John", "Doe", 24));
        students.put(2, new Student(2, "Jane", "Richards", 20));
        students.put(3, new Student(3, "Nicolas", "Edd", 22));
        all = students;
    }

    public static HashMap<Integer, Student> getStudents() {
        return all;
    }

    public static void deleteById(int id) {
        all.remove(id);
        
        // TODO: Handle cases wherer user removes an unexisting ID
    }

    public static void add(String firstName, String lastName, int age) {
        Integer id = Students.getStudents().size() + 1;
        Student student = new Student(id, firstName, lastName, age);
        all.put(id, student);
        // TODO: Handle cases wherer user creates an existing Student
    }

    public static void modifyById(int id, String firstName, String lastName, int age) {
        Student student = new Student(id, firstName, lastName, age);
        all.put(id, student);
        // TODO: Handle cases wherer user update an existing Student
    }
}
