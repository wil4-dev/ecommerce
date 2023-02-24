package com.ecommerce.service;

import java.util.Optional;

import com.ecommerce.entity.Usuario;

public interface IUsuarioService {

	Optional<Usuario> findById(Integer id);
	
}
