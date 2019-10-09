package com.bext.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bext.model.Persona;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TestController {
	private List<Persona> personas = createList();

	@RequestMapping(value = "/personas" , method = RequestMethod.GET, produces = "application/json")
	public List<Persona> listarPersonas() {
		return personas;
	}
	
	private List<Persona> createList() {
		List<Persona> testPersonas = new ArrayList<>();
		
		Persona persona1 = new Persona();
		persona1.setId("1");
		persona1.setNombre("Beto Martinez");
		persona1.setEmail("beto@email.com");
		persona1.setPeso(75.123);
		testPersonas.add(persona1);
		
		Persona persona2 = new Persona();
		persona2.setId("2");
		persona2.setNombre("Guille Gallo");
		persona2.setEmail("guille@email.com");
		persona2.setPeso(64.53);
		testPersonas.add(persona2);
		
		return testPersonas;
	}
}
