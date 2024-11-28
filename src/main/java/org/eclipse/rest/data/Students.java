/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eclipse.rest.data;

//import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.rest.beans.Student;

/**
 *
 * @author loickcherimont
 */
public class Students {

    private final HashMap<Integer, Student> students;

    public Students() {
        students = new HashMap<>();
        students.put(1, new Student(1, "John", "Doe", 24));
        students.put(2, new Student(2, "Jane", "Richards", 20));
        students.put(3, new Student(3, "Nicolas", "Edd", 22));
    }
    
    // Util for later
    public HashMap<Integer, Student> getStudents() {
        return students;
    }
}
