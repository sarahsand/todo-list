package com.todo.todolist.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

	@RequestMapping("/hello")
	public String get() {
		return "Hello World";
	}
	
}
