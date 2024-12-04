/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eclipse.rest.restservice;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import org.eclipse.rest.data.Students;

/**
 *
 * @author loickcherimont
 */

/* Load this class before all the application */
@Singleton
@Startup
public class StartupService {
    
    @PostConstruct
    public void init() {
        Students.generateAll();
    }
}
