package com.simplilearn.assigment.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userID;
	private String name;
	private String lastName;
	private Date birthDate;
	private boolean admin;
	private String username;
	private String password;
	/**
	 * 
	 */
	public User() {
		super();
	}
	
	
	/**
	 * @param name
	 * @param lastName
	 * @param birthDate
	 * @param admin
	 * @param username
	 * @param password
	 */
	public User(String name, String lastName, Date birthDate, boolean admin, String username, String password) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.admin = admin;
		this.username = username;
		this.password = password;
	}


	public long getUserID() {
		return userID;
	}
	public void setUserID(long userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [userID=" + userID + ", name=" + name + ", lastName=" + lastName + ", birthDate=" + birthDate
				+ ", admin=" + admin + "]";
	}
}
