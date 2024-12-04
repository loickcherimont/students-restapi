/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eclipse.rest.restservice.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.rest.beans.Student;
import org.eclipse.rest.data.Students;

/**
 *
 * @author loickcherimont
 */
@Path("student")
public class GetStudentBy {

    @GET
    @Path("id/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student idService(@PathParam("id") int id) {
        return Students.getStudents().get(id);
    }

    @GET
    @Path("firstname/{firstname}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student firstNameService(@PathParam("firstname") String firstName) {
        for (Student student : Students.getStudents().values()) {
            if (student.getFirstName().equalsIgnoreCase(firstName)) {
                return student;
            }
        }
        return new Student();
    }

    @GET
    @Path("lastname/{lastname}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student lastNameService(@PathParam("lastname") String lastName) {
        for (Student student : Students.getStudents().values()) {
            if (student.getLastName().equalsIgnoreCase(lastName)) {
                return student;
            }
        }
        return new Student();
    }

    @GET
    @Path("age/{age}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student ageService(@PathParam("age") int age) {
        for (Student student : Students.getStudents().values()) {
            if (student.getAge() == age) {
                return student;
            }
        }
        return new Student();
    }

}
