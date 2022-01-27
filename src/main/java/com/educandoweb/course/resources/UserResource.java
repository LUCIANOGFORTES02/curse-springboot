package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.UserService;

@RestController//Caminho do recurso
@RequestMapping(value = "/users")
public class UserResource {
	@Autowired
	private UserService service;
	
	
	//Para indicar que esse é um método que responde a requisição do método get do htpp
	@GetMapping
	//entity point para acessar os usuarios
	public ResponseEntity<List<User>> findAll() {
		 List<User>list =service.findAll(); 
		//retornar um ResponseEntity.ok() para retornar a 
		//resposta com sucesso e o .body para retorna o corpo da resposta esse usuario u
		return ResponseEntity.ok().body(list);
	}
	//Buscar usuario por id 
	@GetMapping(value = "/(id)")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
