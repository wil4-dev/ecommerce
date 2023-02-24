package com.ecommerce.service;

import java.util.List;

import com.ecommerce.entity.Orden;

public interface IOrdenService {

	List<Orden> findAll();
	
	Orden save(Orden orden);
	
	String generarNumeroOrden();
}
