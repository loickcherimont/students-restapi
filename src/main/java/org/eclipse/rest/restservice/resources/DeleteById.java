/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eclipse.rest.restservice.resources;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.rest.data.Students;

/**
 *
 * @author loickcherimont
 */
@Path("delete-student")
public class DeleteById {
    
    @DELETE
    @Path("id/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String deleteService(@PathParam("id") int id) {
        Students.deleteById(id);
        return "Student deleted with SUCCESS";
    }
}
