package com.ecommerce.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.Orden;
import com.ecommerce.entity.Usuario;

@Repository
public interface IOrdenDao extends JpaRepository<Orden, Integer>{

	List<Orden> findByUsuario(Usuario usuario);
	
}
