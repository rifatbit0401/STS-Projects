package com.example.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class UserService {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List getUsers(String name, String email){
		
		if(entityManager.equals(null)) {
			System.out.println("okkk");
		}
		
		List users =  entityManager.createQuery("select u from user u where u.name=name and u.email=email").
		setParameter("name", name).setParameter("email", email).getResultList();
		return users;
		
	}
}
