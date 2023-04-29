package com.alunoweb.aluno.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.alunoweb.aluno.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
