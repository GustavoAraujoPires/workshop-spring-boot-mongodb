package com.gustavoaraujo.workshopmongo.Repository;

import com.gustavoaraujo.workshopmongo.domain.Post;
import com.gustavoaraujo.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {


}
