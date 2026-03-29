package com.gustavoaraujo.workshopmongo.services;

import com.gustavoaraujo.workshopmongo.Repository.PostRepository;
import com.gustavoaraujo.workshopmongo.Repository.UserRepository;
import com.gustavoaraujo.workshopmongo.domain.Post;
import com.gustavoaraujo.workshopmongo.domain.User;
import com.gustavoaraujo.workshopmongo.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
	
	@Autowired
	public PostRepository repo;
	

	public Post findById(String id) {
		return repo.findById(id).orElse(null);
	}

	public List<Post> findByTitle (String text){
		return repo.findByTitleContainingIgnoreCase(text);
	}


}
