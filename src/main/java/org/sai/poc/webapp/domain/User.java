/**
 * Bean that represents the user in the repository
 */
package org.sai.poc.webapp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "test_user")
public class User implements Serializable {
    private static final long serialVersionUID = 934038610149319103L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    @Column
    private String userName;

    public User() {

    }

    public User(int id, String name, String userName) {
	this.id = id;
	this.name = name;
	this.userName = userName;
    }

    public int getId() {
	return id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getUserName() {
	return userName;
    }

    public void setUserName(String userName) {
	this.userName = userName;
    }

}
