package com.lorefior.banco.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lorefior.banco.model.Sucursal;
import com.lorefior.banco.repository.SucursalRepository;

@Service
public class SucursalService {
	
	@Autowired
	SucursalRepository sucRepository;
	
	public Optional<Sucursal> buscarSucursal(long id) {
		Optional<Sucursal> sucursal;
		sucursal = sucRepository.findById(id);
		return sucursal;
	}
	
	public List<Sucursal> listaSucursal() {
		return  sucRepository.findAll();
	}
	
	public Sucursal guardarSucursal(Sucursal sucursal) {
		Sucursal Sucursal = sucRepository.save(sucursal);
		return Sucursal;	
	}
	

}
