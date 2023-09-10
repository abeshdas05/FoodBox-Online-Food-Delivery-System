package com.restaurant.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ContactForm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long contactFormId;
	private String name;
	private String email;
	private String subject;
	private String message;
	
}
