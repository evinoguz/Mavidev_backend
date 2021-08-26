package com.example.mavidev.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mavidev.business.abstracts.CountyService;
import com.example.mavidev.core.utilities.results.DataResult;
import com.example.mavidev.core.utilities.results.SuccessDataResult;
import com.example.mavidev.dataAccess.abstracts.CountyDao;
import com.example.mavidev.entities.concretes.County;

@Service
public class CountyManager implements CountyService{

	private CountyDao countyDao;
	@Autowired
	public CountyManager(CountyDao countyDao) {
		super();
		this.countyDao = countyDao;
	}
	
	@Override
	public DataResult<List<County>> getAll() {
		return new SuccessDataResult<List<County>>
		(this.countyDao.findAll(),"İLÇELER listelendi.");
	}

	@Override
	public DataResult<List<County>> getByCity(int cityId) {
		return new SuccessDataResult<List<County>>
		(this.countyDao.getByCity(cityId),cityId+", ilinin ilçeleri listelendi.");
	}

	@Override
	public DataResult<County> getByCountyId(int countyId) {
		return new SuccessDataResult<County>
		(this.countyDao.getByCountyId(countyId),"veri oluşturuldu....");
	}

}
