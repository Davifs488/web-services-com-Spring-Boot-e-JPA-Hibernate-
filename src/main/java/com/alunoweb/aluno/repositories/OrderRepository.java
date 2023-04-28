package com.alunoweb.aluno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alunoweb.aluno.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
