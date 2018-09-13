/**
 * Implements the repository access for the user
 */
package org.sai.poc.webapp.repository;

import java.util.List;

import org.sai.poc.webapp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findByName(String name);

}
