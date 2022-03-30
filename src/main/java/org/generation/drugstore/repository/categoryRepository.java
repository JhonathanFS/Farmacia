package org.generation.drugstore.repository;

import java.util.List;

import org.generation.drugstore.model.category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface categoryRepository extends JpaRepository <category, Long> {

	public List<category> findAllByTipoContainingIgnoreCase (String tipo);

}
