////////////////////////////////////////////////////////////////////////////////
// HotelModelTest: $Source$
// TODO Class summary goes here
//
// Created : 15 nov. 2005 by jfsmart
// Last modified $Date$ by $Author$
// Revision: $Revision$
// Version : $ID$
// Copyright (c) 2005
////////////////////////////////////////////////////////////////////////////////

package com.javaworld.hotels.model;

import java.util.List;

import com.javaworld.hotels.businessobjects.Hotel;

import junit.framework.TestCase;

public class HotelModelTest extends TestCase {

	public void testTrouveHotelsParVille1() {
		HotelModel finder = new HotelModel();
		List<Hotel> hotels = finder.trouveHotelsParVille("Paris");
		assertTrue(hotels.size() > 0);
		for(Hotel h : hotels) {
			assertEquals(h.getVille(),"Paris");
		}
	}

	public void testTrouveHotelsParVille2() {
		HotelModel finder = new HotelModel();
		List<Hotel> hotels = finder.trouveHotelsParVille("Londres");
		assertTrue(hotels.size() > 0);
		for(Hotel h : hotels) {
			assertEquals(h.getVille(),"Londres");
		}
	}

	public void testTrouveHotelsParVille3() {
		HotelModel finder = new HotelModel();
		List<Hotel> hotels = finder.trouveHotelsParVille("Tokyo");
		assertTrue(hotels.size() > 0);
		for(Hotel h : hotels) {
			assertEquals(h.getVille(),"Tokyo");
		}
	}

	public void testTrouveHotelsParVille4() {
		HotelModel finder = new HotelModel();
		List<Hotel> hotels = finder.trouveHotelsParVille("Machupichu");
		assertTrue(hotels.size() > 0);
		for(Hotel h : hotels) {
			assertEquals(h.getVille(),"Machupichu");
		}
	}

	public void testTrouveHotelsParVilleVide() {
		HotelModel finder = new HotelModel();
		List<Hotel> hotels = finder.trouveHotelsParVille("");
		assertTrue(hotels.size() == 0);
	}

	public void testTrouveHotelsParVilleNull() {
		HotelModel finder = new HotelModel();
		List<Hotel> hotels = finder.trouveHotelsParVille(null);
		assertTrue(hotels.size() == 0);
	}

	public void testTrouveVillesDiponibles() {
		HotelModel trouveur = new HotelModel();
		String[] villes = trouveur.trouveVillesDiponibles();
		assertEquals(villes.length, 4);
	}

}
