package com.i.orchestration.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {

	@Id
	private Integer id;
	private String firstname;
	private String lastname;
	private String address;
	private String postalcode;
	private Long mobileNumber;
	private String email;
}
