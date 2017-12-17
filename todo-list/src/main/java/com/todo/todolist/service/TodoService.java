package com.todo.todolist.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.todo.todolist.model.Todo;

//Todoservice uses a simple ArrayList to store a list of todo’s in memory. It offers a method to retrieve the todo’s.
@Service
public class TodoService {

	  private static List<Todo> todos = new ArrayList<Todo>();
	    private static int todoCount = 3;

	    static {
	        todos.add(new Todo(1, "test", "Make a list", new Date(),false));
	        todos.add(new Todo(2, "test", "Check it twice", new Date(), false));
	        todos.add(new Todo(3, "test", "Determine who's naughty and who's nice", new Date(),false));
	    }

	    public List<Todo> retrieveTodos(String user) {
	        List<Todo> filteredTodos = new ArrayList<Todo>();
	        for (Todo todo : todos) {
	            if (todo.getUser().equals(user)) {
	                filteredTodos.add(todo);
	            }
	        }
	        return filteredTodos;
	    }
}
