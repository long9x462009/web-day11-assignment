package com.example.webday11.assignment.controller;

import com.example.webday11.assignment.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webday11.assignment.dto.UserDTO;
import com.example.webday11.assignment.entity.User;
import com.example.webday11.assignment.service.RoleService;
import com.example.webday11.assignment.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	private RoleService roleService;
	private UserService userService;

	@Autowired
	public UserController(RoleService roleService, UserService userService){
		this.roleService = roleService;
		this.userService = userService;
	}

	@PostMapping
	public void insertUser(@RequestBody UserDTO body) {
		User user = new User();
		Role name = new Role();
		user.setFullname(body.getFullname());
		user.setUsername(body.getUsername());

		userService.insert(user);
		roleService.findByRoleName(name);

	}
}
