package com.gustavoaraujo.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavoaraujo.workshopmongo.Repository.UserRepository;
import com.gustavoaraujo.workshopmongo.domain.User;

@Service
public class UserService {
	
	@Autowired
	public UserRepository repo;
	
	public List<User>findAll(){
		return repo.findAll();
		}
	
	
}
