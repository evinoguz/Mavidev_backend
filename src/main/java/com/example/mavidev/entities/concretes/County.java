package com.example.mavidev.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="counties")
@Entity
@JsonIgnoreProperties({"city_count"})

public class County {
	@Id
	@Column(name="county_id")
	private int countyId;
	
	@Column(name="county_name")
	private String countyName;
	
	//@Column(name="city_id")
	//private int cityId;
	
	@OneToMany(mappedBy = "county")
	private List<CityCounty> city_count;
	
	@ManyToOne()
	@JoinColumn(name="city_id")
	private City city;
	
}