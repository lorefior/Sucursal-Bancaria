package com.lorefior.banco.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lorefior.banco.model.Persona;
import com.lorefior.banco.service.PersonaService;

@RestController
@RequestMapping(value = "/api/persona/")
@CrossOrigin("*")
public class PersonaController {
	
	@Autowired
	PersonaService perService;
	
    @GetMapping(value = "/all")
    public java.util.List<Persona> getAllPersona() {
        return perService.listaPersona();
    }
    
    @GetMapping(value = "/find/{id}")
	public ResponseEntity<?> getPersona(@PathVariable long id) {
		Optional persona = perService.buscarPersona(id);
		if (persona.isPresent()) {
			return new ResponseEntity<>(persona, HttpStatus.OK);
			
		} else {
			return new ResponseEntity<>("no encotrada", HttpStatus.NO_CONTENT);
		}
	}
    
	@PostMapping(value = "/save")
	public ResponseEntity<Persona> save(@RequestBody Persona persona) {
		Persona obj = perService.guardarPersonal(persona);
		return new ResponseEntity<Persona>(obj, HttpStatus.OK);
	}
	

}
