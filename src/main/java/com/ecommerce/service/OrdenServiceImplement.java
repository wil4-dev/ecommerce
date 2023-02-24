package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.IOrdenDao;
import com.ecommerce.entity.Orden;

@Service
public class OrdenServiceImplement implements IOrdenService{

	@Autowired
	private IOrdenDao ordenDao;
	
	@Override
	public Orden save(Orden orden) {
		return ordenDao.save(orden);
	}

	@Override
	public List<Orden> findAll() {
		return ordenDao.findAll();
	}
	
	public String generarNumeroOrden() {
		int numero = 0;
		String numeroConcatenado = "";
		List<Orden> ordenes = findAll();
		List<Integer> numeros = new ArrayList<Integer>();
		ordenes.stream().forEach(o -> numeros.add(Integer.parseInt(o.getNumero())));
		if(ordenes.isEmpty()) {
			numero = 1;
		} else {
			numero = numeros.stream().max(Integer::compare).get(); //obtenemos el número mayor
			numero++;
		}
		if(numero < 10) {
			numeroConcatenado = "000000000"+String.valueOf(numero);
		} else if(numero < 100) {
			numeroConcatenado = "00000000"+String.valueOf(numero);
		} else if(numero < 1000) {
			numeroConcatenado = "0000000"+String.valueOf(numero);
		} else if(numero < 10000) {
			numeroConcatenado = "000000"+String.valueOf(numero);
		}
		return numeroConcatenado;
	}

}
