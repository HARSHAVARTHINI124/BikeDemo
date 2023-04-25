package com.bike.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.bike.demo.model.BikeDemo;
import com.bike.demo.repository.BikeDemoRepository;



@Service

public class BikeDemoService {

	@Autowired
	BikeDemoRepository br;
	
	public List<BikeDemo> getAllDetails(){
		
		return br.findAll();
	}
	
	public BikeDemo saveDetails(@RequestBody BikeDemo b) {
		
		return br.save(b);
	}
	

	public BikeDemo saveupdate(@RequestBody BikeDemo x) {
		
		return br.save(x);
	}
	public void deleteDetails(@PathVariable int a) {
		
		br.deleteById(a);
	}
	
}
