package com.example.mavidev.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mavidev.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer>{

}