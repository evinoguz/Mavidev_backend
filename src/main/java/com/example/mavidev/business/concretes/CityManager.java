package com.example.mavidev.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mavidev.business.abstracts.CityService;
import com.example.mavidev.core.utilities.results.DataResult;
import com.example.mavidev.core.utilities.results.SuccessDataResult;
import com.example.mavidev.dataAccess.abstracts.CityDao;
import com.example.mavidev.entities.concretes.City;

@Service
public class CityManager implements CityService{
	private CityDao cityDao;
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<List<City>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<City>>
		(this.cityDao.findAll(),"İLLER listelendi.");
	}

}
