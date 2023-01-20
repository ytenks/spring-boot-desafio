package com.meta3.desafiometa3.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meta3.desafiometa3.classes.User;
import com.meta3.desafiometa3.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository; 
	
public List<User> findAll(){
	return repository.findAll();
}

public User findById(Long id) {
	Optional<User> obj = repository.findById(id);
	return obj.get();
}

}
