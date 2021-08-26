package com.example.mavidev.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mavidev.business.abstracts.CityCountyService;
import com.example.mavidev.core.utilities.results.DataResult;
import com.example.mavidev.core.utilities.results.Result;
import com.example.mavidev.core.utilities.results.SuccessDataResult;
import com.example.mavidev.core.utilities.results.SuccessResult;
import com.example.mavidev.dataAccess.abstracts.CityCountyDao;
import com.example.mavidev.entities.concretes.CityCounty;

@Service
public class CityCountyManager implements CityCountyService{

	private CityCountyDao cityCountyDao;
	@Autowired
	public CityCountyManager(CityCountyDao cityCountyDao) {
		super();
		this.cityCountyDao = cityCountyDao;
	}
 
	@Override
	public DataResult<List<CityCounty>> getAll() {
		return new SuccessDataResult<List<CityCounty>>
		(this.cityCountyDao.findAll(),"İL/İLÇE listelendi. ");
	}

	@Override
	public Result add(CityCounty cityCounty) {
		this.cityCountyDao.save(cityCounty);
		return new SuccessResult("İL/İLÇE eklendi. ");
	}

}