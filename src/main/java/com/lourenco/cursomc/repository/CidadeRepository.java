package com.lourenco.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lourenco.cursomc.model.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
