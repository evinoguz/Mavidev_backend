package com.example.mavidev.business.abstracts;

import java.util.List;

import com.example.mavidev.core.utilities.results.DataResult;
import com.example.mavidev.entities.concretes.County;

public interface CountyService {
	DataResult<List<County>> getAll();
	DataResult<List<County>> getByCity(int cityId);
	DataResult<County> getByCountyId(int countyId);
}
