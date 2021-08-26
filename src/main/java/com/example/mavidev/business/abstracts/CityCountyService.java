package com.example.mavidev.business.abstracts;

import java.util.List;
import com.example.mavidev.core.utilities.results.DataResult;
import com.example.mavidev.core.utilities.results.Result;
import com.example.mavidev.entities.concretes.CityCounty;

public interface CityCountyService {
	DataResult<List<CityCounty>> getAll();
	Result add(CityCounty cityCounty);
	
}
