package com.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.Orden;

@Repository
public interface IOrdenDao extends JpaRepository<Orden, Integer>{

}
