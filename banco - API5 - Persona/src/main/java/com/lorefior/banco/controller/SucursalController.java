package com.lorefior.banco.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lorefior.banco.model.Sucursal;
import com.lorefior.banco.service.SucursalService;


@RestController
@RequestMapping(value = "/api/sucursal/")
@CrossOrigin("*")
public class SucursalController {

	@Autowired
	SucursalService sucService;

	
	 @GetMapping(value = "/all")
    public java.util.List<Sucursal> getAllSucursales() {
        return sucService.listaSucursal();
    }
    
	  @GetMapping(value = "/find/{id}")
	public ResponseEntity<?> getDomicilio(@PathVariable long id) {
		Optional sucursal = sucService.buscarSucursal(id);
		if (sucursal.isPresent()) {
			return new ResponseEntity<>(sucursal, HttpStatus.OK);
			
		} else {
			return new ResponseEntity<>("no encotrada", HttpStatus.NO_CONTENT);
		}
	}
	
	
//	@PostMapping("/sucursal/add")
//	public Sucursal createSucursal(@RequestBody Sucursal body) {
//		return sucService.guardarSucursal(body);
//	}
//
//	@PutMapping("/sucursal/actualizar")
//	public Sucursal updateSucursal(@RequestBody Sucursal body) {
//		return sucService.guardarSucursal(body);
//	}

}
