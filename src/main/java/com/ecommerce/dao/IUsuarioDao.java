package com.ecommerce.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.Usuario;



@Repository
public interface IUsuarioDao extends JpaRepository<Usuario, Integer>{

	Optional<Usuario> findByEmail(String email);
	
}
