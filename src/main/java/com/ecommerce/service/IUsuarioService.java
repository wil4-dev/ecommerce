package com.ecommerce.service;

import java.util.Optional;


import com.ecommerce.entity.Usuario;

public interface IUsuarioService {

	Optional<Usuario> findById(Integer id);
	
	Usuario save(Usuario usuario);

	Optional<Usuario> findByEmail(String email);
	
}
