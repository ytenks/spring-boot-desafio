package com.meta3.desafiometa3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.model.Model;

@RestController
@RequestMapping(value = "/post")
public class PostsController {
	@GetMapping
    public String usersForm(final Model model) {
        return "userForm";
    }
	
}
