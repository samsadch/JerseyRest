package com.samsad.demorest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("alien")
public class AlienResourse {
	
	AlienRepository alienRepo = new AlienRepository(); 
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAlien() {		
		System.out.println("Get alien method called");			
		return alienRepo.getAlienList();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Aliens getAlienObject() {		
		System.out.println("Get alien method called");	
		Aliens al = new Aliens();
		al.setAlien(alienRepo.getAlienList());
		return al;
	}
}
