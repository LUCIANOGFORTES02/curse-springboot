package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;
@Service//Registra a su classe como componente do spring e ele vai poder ser injetado automaticamente com Autowide
public class UserService {

	@Autowired
	private UserRepository 	repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
//Buscar o usuario por id
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		
		return obj.get();
		
	}
	
}
