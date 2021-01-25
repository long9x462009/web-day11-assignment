package com.example.webday11.assignment.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String fullname;

//	@ManyToMany(fetch = FetchType.EAGER)
//	@JoinTable(name = "USER_ROLE",
//			joinColumns = @JoinColumn(name = "USER_ID"),
//			inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
	@ManyToMany(mappedBy = "user")
	private Set<Role> roles;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}
