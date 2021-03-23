package com.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.jdbc.model.User;
import com.app.model.StudentModel;
import com.app.service.StudentService;
import com.app.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value="user")
public class UserController {
	
	static Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@PostMapping
	public ResponseEntity<User> create(@Valid @RequestBody User user) {
		return ResponseEntity.ok(HttpStatus.OK).ok(userService.save1(user));
	}
	
	@GetMapping
	public ResponseEntity<Object> getStudent() {
		return ResponseEntity.ok(HttpStatus.OK).ok(userService.findAll());
	}
	
	@GetMapping(value="/v2/{id}")
	public ResponseEntity<List<StudentModel>> getStudent2(@PathVariable("id") Integer id, 
			@RequestParam(value="startsWith", required = false) String nameStartsWith) {
		return null;
	}
		
	@PutMapping(value="/{id}")
	public ResponseEntity<String> put(@PathVariable("id") Integer id, @RequestBody StudentModel student) {
		return null;
	}

	
	@DeleteMapping(value="/delete")
	public ResponseEntity<String> delete(@RequestBody StudentModel student) {
		return null;
	}
	
	

}
