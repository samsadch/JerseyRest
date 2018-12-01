package com.samsad.demorest;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository 
{
	List<Alien> aliens;
	
	public AlienRepository() {
		
		aliens = new ArrayList<>();
		Alien a = new Alien();
		a.setName("samsad");
		a.setPoint(100);
		aliens.add(a);
		Alien a1 = new Alien();
		a1.setName("Nihala");
		a1.setPoint(99);
		aliens.add(a1);
	}
	
	public List<Alien> getAlienList(){
		System.out.println("get Alien called");
		return aliens;
	}
	
	public Alien getAlien(int id){
		for(Alien a : aliens) {
			if(a.getPoint()==id) {
				return a;
			}
		}
		//return new Alien();
		return null;
	}
}
