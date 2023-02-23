package com.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.ProductoDao;
import com.ecommerce.entity.Producto;

@Service
public class ProductoServiceImplement implements ProductoService{

	@Autowired
	private ProductoDao productoDao;
	
	@Override
	public Producto save(Producto producto) {
		return productoDao.save(producto);
	}

	@Override
	public Optional<Producto> get(Integer id) {
		return productoDao.findById(id);
	}

	@Override
	public void update(Producto producto) {
		productoDao.save(producto);
	}

	@Override
	public void delete(Integer id) {
		productoDao.deleteById(id);
	}

}
