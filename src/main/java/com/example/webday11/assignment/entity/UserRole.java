//package com.example.webday11.assignment.entity;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "USER_ROLE")
//public class UserRole {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @ManyToOne
//    @JoinColumn(name = "ROLE_ID", referencedColumnName = "ID")
//    private Role role;
//
//    @ManyToOne
//    @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
//    private User user;
//
//    private int getId(){return id;}
//
//    public void setId(int id){this.id = id;}
//
//    public Role getRole(){return role;}
//
//    public void setRole(Role role){this.role = role;}
//
//    public User getUser(){return user;}
//
//    public void setUser(User user){this.user = user;}
//
//}
