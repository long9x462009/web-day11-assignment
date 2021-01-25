package com.example.webday11.assignment.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Role {

	@Id
	private int id;
	private String name;

//	@ManyToMany(mappedBy = "role")
//	private Set<User> user;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "USER_ROLE",
			joinColumns = @JoinColumn(name = "ROLE_ID"),
			inverseJoinColumns = @JoinColumn(name = "USER_ID"))
	private Set<User> user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<User> getUser(){return user;}

	public void setUser(Set<User> user){this.user= user;}

}
