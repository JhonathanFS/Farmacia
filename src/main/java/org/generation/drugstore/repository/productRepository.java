package org.generation.drugstore.repository;

import java.util.List;

import org.generation.drugstore.model.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepository extends JpaRepository<product, Long>{
	
	public List<product> findAllByNomeContainingIgnoreCase (String nome);
	
}
