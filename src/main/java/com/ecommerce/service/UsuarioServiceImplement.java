package com.ecommerce.service;

import java.util.List;
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

	@Override
	public Usuario save(Usuario usuario) {
		return usuarioDao.save(usuario);
	}

	@Override
	public Optional<Usuario> findByEmail(String email) {
		return usuarioDao.findByEmail(email);
	}

	@Override
	public List<Usuario> findAll() {
		return usuarioDao.findAll();
	}
	

}
