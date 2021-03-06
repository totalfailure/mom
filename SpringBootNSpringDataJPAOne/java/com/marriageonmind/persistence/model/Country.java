package com.marriageonmind.persistence.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Country implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	
	@OneToMany(mappedBy="country")
	private Collection<City> cities;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
public Collection<City> getCities() {
	return cities;
}

public void setCities(Collection<City> cities) {
	this.cities = cities;
}



public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
