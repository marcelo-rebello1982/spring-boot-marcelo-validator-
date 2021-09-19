package com.lourenco.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lourenco.cursomc.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}
