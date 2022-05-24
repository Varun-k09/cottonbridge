package com.snipe.cottonbridge.controller;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.snipe.cottonbridge.model.Admin;
import com.snipe.cottonbridge.model.Farmer;
import com.snipe.cottonbridge.serviceimplimentation.FarmerImplimentation;


@RestController
@CrossOrigin("*")
public class FarmerController {
	
	
	@Autowired
	private FarmerImplimentation farmerImplimentation;
	@PostMapping(value = "saveFarmer")
	public String addFarmer(@RequestBody Farmer farmer){
		System.out.println("add new farmer ");
		farmerImplimentation.saveFarm(farmer);
		
		return "new admin added successfuly";
	}
	
	@PutMapping(value = "updateFarmer")
	public Farmer updateFarmer(@RequestBody Farmer farmer) {
		System.out.println("values updated successfully");
		return farmerImplimentation.updateFarm(farmer);
	}
	
	@DeleteMapping(value = "deleteFarmer")
	public String  deleteFarmer(@RequestParam Integer id) {
		System.out.println("at delete employee");
		 farmerImplimentation.deleteFarm(id);
		return "farmer deleted";
	}
	
	@GetMapping(value = "findAllFarmer")
	public List<Farmer> findAllFarmer(){
		return farmerImplimentation.getAll();
	}
	

	

}
