package com.example.mavidev.business.abstracts;

import java.util.List;

import com.example.mavidev.core.utilities.results.DataResult;
import com.example.mavidev.entities.concretes.City;

public interface CityService {
	DataResult<List<City>> getAll();
}
