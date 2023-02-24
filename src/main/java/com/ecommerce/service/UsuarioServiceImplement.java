package com.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.IUsuarioDao;
import com.ecommerce.entity.Usuario;

@Service
public class UsuarioServiceImplement implements IUsuarioService{

	@Autowired
	private IUsuarioDao usuarioDao;

	@Override
	public Optional<Usuario> findById(Integer id) {
		return usuarioDao.findById(id);
	}
	
	

}
