package com.example.mavidev.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mavidev.business.abstracts.CityCountyService;
import com.example.mavidev.core.utilities.results.DataResult;
import com.example.mavidev.core.utilities.results.Result;
import com.example.mavidev.entities.concretes.CityCounty;

@RestController
@RequestMapping("/api/city_county")
@CrossOrigin
public class CityCountyController {

	private CityCountyService cityCountyService;
	
	@Autowired
	public CityCountyController(CityCountyService cityCountyService) {
		super();
		this.cityCountyService = cityCountyService;
	}

	@GetMapping("/getall")
	public DataResult<List<CityCounty>> getAll(){
		return this.cityCountyService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody CityCounty cityCount) {
		return this.cityCountyService.add(cityCount);
	}
	
}

