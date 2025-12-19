package com.gustavoaraujo.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavoaraujo.workshopmongo.Repository.UserRepository;
import com.gustavoaraujo.workshopmongo.domain.User;
import com.gustavoaraujo.workshopmongo.dto.UserDTO;

@Service
public class UserService {
	
	@Autowired
	public UserRepository repo;
	
	public List<User>findAll(){
		return repo.findAll();
		}
	
	
	public User findById(String id) {
		return repo.findById(id).orElse(null);
	}
	
	public User insert (User obj) {
		return repo.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(),objDto.getName(), objDto.getEmail());
	}
}
