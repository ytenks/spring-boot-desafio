package com.meta3.desafiometa3.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.meta3.desafiometa3.classes.Category;
import com.meta3.desafiometa3.classes.Order;
import com.meta3.desafiometa3.classes.Post;
import com.meta3.desafiometa3.classes.User;
import com.meta3.desafiometa3.repositories.OrderRepository;
import com.meta3.desafiometa3.repositories.PostRepository;
import com.meta3.desafiometa3.repositories.CategoryRepository;
import com.meta3.desafiometa3.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private PostRepository postRepository;
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Artur", "arturedmundo@hotmail.com",true);
		User u2 = new User(null, "TenKs", "tenks@gmail.com", true);
		
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);
		
		Category c1 = new Category(null, "Text");
		Category c2 = new Category(null, "Img");
		
		Post p1 = new Post(null,"POST ALEATORIO 1 -- ESTOU FELIZ");
		Post p2 = new Post(null,"POST ALEATORIO 2 -- NÃO ESTOU FELIZ");
		Post p3 = new Post(null,"POST ALEATORIO 31 -- ESTOU FELIZ");
		Post p4 = new Post(null,"POST ALEATORIO 333 -- NÃO ESTOU FELIZ");

	
		
	userRepository.saveAll(Arrays.asList(u1,u2));
	orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	categoryRepository.saveAll(Arrays.asList(c1,c2));
	postRepository.saveAll(Arrays.asList(p1,p2,p3,p4));
	}
}
