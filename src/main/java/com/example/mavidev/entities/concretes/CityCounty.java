package com.example.mavidev.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="city_county")
@AllArgsConstructor
@NoArgsConstructor

public class CityCounty {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="city_county_id")
	private int id;
	
	//@Column(name="county_id")
	//private int countyId;
	
	@ManyToOne()
	@JoinColumn(name="county_id")
	private County county;
}

