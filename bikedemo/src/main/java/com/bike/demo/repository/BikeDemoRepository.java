package com.bike.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bike.demo.model.BikeDemo;

@Repository


	public interface BikeDemoRepository extends JpaRepository<BikeDemo,Integer>{
	
}
