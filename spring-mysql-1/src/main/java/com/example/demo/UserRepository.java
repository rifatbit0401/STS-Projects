package com.example.demo;

import javax.persistence.PersistenceContext;

import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

	
	Iterable<User> getByName(String name);
	
	Iterable<User>getByNameAndEmail(String name, String email);
	
	Iterable<User>getByNameOrEmail(String name, String email);
}
