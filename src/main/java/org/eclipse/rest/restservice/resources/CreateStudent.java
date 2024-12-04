package org.eclipse.rest.restservice.resources;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.rest.data.Students;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author loickcherimont
 */
@Path("add-student")
public class CreateStudent {
    
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String create(@QueryParam("firstname") String firstName, @QueryParam("lastname") String lastName, @QueryParam("age") int age) {
        Students.add(firstName, lastName, age);
        return "New Student created and added";
    }
}
