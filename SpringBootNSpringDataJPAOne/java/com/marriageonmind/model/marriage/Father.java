package com.marriageonmind.model.marriage;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.marriageonmind.model.MobileNo;

@Entity
public class Father implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
private String fullName;
private boolean alive;
private Profession profession;
private Job job;
private MobileNo mobileNo;


}
