package com.meta3.desafiometa3.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

public User insert(User obj) {
	
	return repository.save(obj);
}

public void delete(Long id) {
	repository.deleteById(id);
}
public User update (Long id, User obj) {
	User entity = repository.getReferenceById(id);
	updateData(entity,obj);
	return repository.save(entity);
}

private void updateData(User entity, User obj) {
	entity.setName(obj.getName());
	entity.setNickname(obj.getNickname());
}

}
