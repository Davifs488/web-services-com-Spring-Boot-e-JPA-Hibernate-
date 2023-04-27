package com.alunoweb.aluno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alunoweb.aluno.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
