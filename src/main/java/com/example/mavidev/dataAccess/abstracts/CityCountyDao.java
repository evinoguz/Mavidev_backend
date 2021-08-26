package com.example.mavidev.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mavidev.entities.concretes.CityCounty;

public interface CityCountyDao extends JpaRepository<CityCounty, Integer>{

}