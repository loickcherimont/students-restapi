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
import org.eclipse.rest.beans.Student;
import org.eclipse.rest.data.Students;

/**
 *
 * @author loickcherimont
 */
@Path("delete")
public class DeleteById {
    
    @DELETE
    @Path("{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String deleteService(@PathParam("id") int id) {
        return "Student id: " + id + ", removed, with SUCCESS!";
    }
}
