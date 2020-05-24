package com.lorefior.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lorefior.banco.model.Mensaje;


public interface MensajeRepository extends JpaRepository<Mensaje, Long>{

}
