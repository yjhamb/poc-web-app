/**
 * Implements the repository access for the user
 */
package com.sai.poc.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sai.poc.webapp.domain.User;

//@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findByName(String name);

}
