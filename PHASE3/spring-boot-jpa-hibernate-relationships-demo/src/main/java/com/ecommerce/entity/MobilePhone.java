package com.ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "mobilephones")
public class MobilePhone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long ID;

	
	//@Pattern(regexp = "\\d{10}")
	@Min(value = 1000000000, message = "Mobile Number should not be less than 1000000000")
	private long number;
	
	private String provider;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	

}
