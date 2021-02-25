package com.niit.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String password;
	private String email;
	private long phoneNumber;
	private String address;
	private String dob;
}
