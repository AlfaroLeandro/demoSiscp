package com.example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {
//	  @Query("select u from User u where u.name = :firstname")
//	  User findByLastnameOrFirstname(@Param("firstname") String firstname);
	  @Query("select u from User u where u.name = ?1")
	  User findByLastnameOrFirstname(String firstname);

}