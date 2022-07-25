package com.Trax.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Leads")
public class Lead {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
@Column(name="first_name",length=45)
private String firstName;
@Column(name="last_name",length=45)
private String lastName;
@Column(name="lead_source")
private String leadSource;
@Column(name="mobile",unique = true,length = 10)
private String mobile;
@Column(name="email",unique = true,length = 125)
private String email;
public long getId() {
	return id;
}
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public String getLeadSource() {
	return leadSource;
}
public String getMobile() {
	return mobile;
}
public String getEmail() {
	return email;
}
public void setId(long id) {
	this.id = id;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public void setLeadSource(String leadSource) {
	this.leadSource = leadSource;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public void setEmail(String email) {
	this.email = email;
}
}
