package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.IDetalleOrdenDao;
import com.ecommerce.entity.DetalleOrden;

@Service
public class DetalleOrdenServiceImplement implements IDetalleOrdenService{

	@Autowired
	private IDetalleOrdenDao detalleOrdenDao;
	
	@Override
	public DetalleOrden save(DetalleOrden detalleOrden) {
		return detalleOrdenDao.save(detalleOrden);
	}

}
