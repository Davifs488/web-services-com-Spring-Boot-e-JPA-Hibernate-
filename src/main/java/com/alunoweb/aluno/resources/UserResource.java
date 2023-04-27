package com.alunoweb.aluno.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alunoweb.aluno.entities.User;

@RestController
@RequestMapping(value = "/users")

public class UserResource {

	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Mariola","mar@gmail.com","99999-2222222","1234");
		return ResponseEntity.ok().body(u);
	}
}
