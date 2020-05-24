package com.lorefior.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lorefior.banco.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

	
}
