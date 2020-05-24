package com.lorefior.banco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lorefior.banco.service.SucursalService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/banco")
public class Controller {
	
	@Autowired
	SucursalService sucService;

}
