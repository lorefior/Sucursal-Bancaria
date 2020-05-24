package com.lorefior.banco.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lorefior.banco.model.Persona;
import com.lorefior.banco.repository.PersonaRepository;

@Service
public class PersonaService {
	
	@Autowired
	PersonaRepository perRepository;
	
	public Optional<Persona> buscarPersona(long id) {
		Optional<Persona> persona;
		persona = perRepository.findById(id);
		return persona;
	}
	
	public List<Persona> listaPersona() {
		return  perRepository.findAll();
	}
	
	public Persona guardarPersonal(Persona persona) {
		Persona Persona = perRepository.save(persona);
		return Persona;	
	}
	

}
