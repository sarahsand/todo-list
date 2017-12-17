package com.todo.todolist.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	//validates a username and password submitted through the form
	public boolean validateUser(String name, String password) {
		return name.equalsIgnoreCase("test")
				&& password.equalsIgnoreCase("00");
	}

}
