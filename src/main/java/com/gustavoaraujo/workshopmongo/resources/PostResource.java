package com.gustavoaraujo.workshopmongo.resources;

import com.gustavoaraujo.workshopmongo.domain.Post;
import com.gustavoaraujo.workshopmongo.domain.User;
import com.gustavoaraujo.workshopmongo.dto.UserDTO;
import com.gustavoaraujo.workshopmongo.services.PostService;
import com.gustavoaraujo.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/posts")
public class PostResource {
	
	@Autowired
	private PostService service;
	

	@GetMapping("/{id}")
	public ResponseEntity<Post> findById(@PathVariable String id){
		Post obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}


}
