package com.newkuar.springbatchpoc.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Users {

	@Id
	private Long userId;

	private String name;

	private String dept;

	private BigDecimal account;

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", name=" + name + ", dept=" + dept + ", account=" + account + "]";
	}
 
	 
}
