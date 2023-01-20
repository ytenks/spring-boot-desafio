package com.meta3.desafiometa3.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meta3.desafiometa3.classes.Category;
import com.meta3.desafiometa3.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository repository; 
	
public List<Category> findAll(){
	return repository.findAll();
}

public Category findById(Long id) {
	Optional<Category> obj = repository.findById(id);
	return obj.get();
}

}
