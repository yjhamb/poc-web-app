/**
 * Implements the repository access for the user
 */
package com.sai.poc.webapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    List<User> findByName(String name);

}
