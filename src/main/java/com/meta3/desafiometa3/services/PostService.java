package com.meta3.desafiometa3.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meta3.desafiometa3.classes.Post;
import com.meta3.desafiometa3.repositories.PostRepository;

@Service
public class PostService {
	@Autowired
	private PostRepository repository; 
	
public List<Post> findAll(){
	return repository.findAll();
}

public Post findById(Long id) {
	Optional<Post> obj = repository.findById(id);
	return obj.get();
}

}
