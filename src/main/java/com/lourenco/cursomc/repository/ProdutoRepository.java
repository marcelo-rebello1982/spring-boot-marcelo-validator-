package com.lourenco.cursomc.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lourenco.cursomc.model.Categoria;
import com.lourenco.cursomc.model.Produto;

/**
 * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
 */
@Repository
//@Transactional(readOnly = true)
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

	/**
	 * A anotação @Query instrui o Spring a fazer a implementação do método, haja
	 * vista que interfaces não possuem implementação, e também não criaremos uma
	 * classe para implementar essa interface.
	 * 
	 * A anotação @Query tem prioridade sobre o nome do método
	 * 
	 * As anotações @Param instruem o Spring a substituir esses parâmetros na Query
	 */
	@Transactional(readOnly = true)
//	@Query("SELECT DISTINCT obj FROM Produto obj INNER JOIN obj.categorias cat WHERE LOWER(obj.nome) LIKE LOWER(CONCAT('%', :nome, '%')) AND cat IN :categorias")
//	Page<Produto> search(@Param("nome") String nome, @Param("categorias") List<Categoria> categorias,
//			Pageable pageRequest);

	// ou usando o padrão de nomes do Spring

	Page<Produto> findDistinctByNomeContainingIgnoreCaseAndCategoriasIn(String nome, List<Categoria> categorias,
			Pageable pageRequest);

}