package com.restaurant.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "orders")
public class OrderDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long orderId;

  private String name;
  private String email;
  private String contact;
  private Double amount;
  private String address;
  private String city;
  private String state;
  private String zip;
  
  private Long userId;
  private String paymentMethod;
  private String paymentId;
  @Temporal(TemporalType.DATE)
	private Date orderDate;


}