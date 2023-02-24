package com.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.Producto;

@Repository
public interface IProductoDao extends JpaRepository<Producto, Integer>{

}
