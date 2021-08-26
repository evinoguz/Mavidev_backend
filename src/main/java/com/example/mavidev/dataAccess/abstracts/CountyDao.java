package com.example.mavidev.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.mavidev.entities.concretes.County;

public interface CountyDao extends JpaRepository<County, Integer>{

	County getByCountyId(int countyId);

	@Query("From County where city.cityId=:cityId")
	List<County> getByCity(int cityId);
	//County getByCity(int cityId);

}
