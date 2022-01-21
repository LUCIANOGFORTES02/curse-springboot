package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController//Caminho do recurso
@RequestMapping(value = "/users")
public class UserResource {
	//Para indicar que esse é um método que responde a requisição do método get do htpp
	@GetMapping
	//entity point para acessar os usuarios
	public ResponseEntity<User> findAll() {
		 
		User u =new User(1L,"Luciano", "luciano@gmail.com", "028090", "12345");
		//retornar um ResponseEntity.ok() para retornar a 
		//resposta com sucesso e o .body para retorna o corpo da resposta esse usuario u
		return ResponseEntity.ok().body(u);
	}
}
