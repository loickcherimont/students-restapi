/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eclipse.rest.restservice.resources;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.rest.data.Students;

/**
 *
 * @author loickcherimont
 */
@Path("update-student")
public class UpdateStudentById {
    
    // @PATCH
    @PUT
    @Path("id/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String update(@PathParam("id") int id, @QueryParam("firstname") String firstName, @QueryParam("lastname") String lastName, @QueryParam("age") int age) {
        Students.modifyById(id, firstName, lastName, age);
        return "Student modify with success";
    }
    
}
