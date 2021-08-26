package com.example.mavidev.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mavidev.business.abstracts.CountyService;
import com.example.mavidev.core.utilities.results.DataResult;
import com.example.mavidev.entities.concretes.County;

@RestController
@RequestMapping("/api/city/county")
@CrossOrigin
public class CountyController {

	private CountyService countyService;
	
	@Autowired
	public CountyController(CountyService countyService) {
		super();
		this.countyService = countyService;
	}

	@GetMapping("/getall")
	public DataResult<List<County>> getAll(){
		return this.countyService.getAll();
	}
	
	@GetMapping("/getByCity")
	public DataResult<List<County>> getByCity(@RequestParam int cityId){
		return this.countyService.getByCity(cityId);
	}
	
	@GetMapping("/getByCountyId")
	public DataResult<County> getByCountyId(@RequestParam int countyId){
		return this.countyService.getByCountyId(countyId);
	}
}

