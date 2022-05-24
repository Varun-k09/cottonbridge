package com.snipe.cottonbridge.serviceimplimentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snipe.cottonbridge.dao.FarmerRepository;
import com.snipe.cottonbridge.model.Farmer;
import com.snipe.cottonbridge.serviceinterface.FarmerInterface;


@Service
public class FarmerImplimentation implements FarmerInterface {
	
	@Autowired
	private FarmerRepository farmeRepository;

	@Override
	public void saveFarm(Farmer farmer) {
		// TODO Auto-generated method stub
		farmeRepository.save(farmer);
		
	}

	@Override
	public Farmer updateFarm(Farmer farmer) {
		// TODO Auto-generated method stub
		return farmeRepository.save(farmer);
	}

	@Override
	public void deleteFarm(int id) {
		// TODO Auto-generted method stub
		farmeRepository.deleteById(id);
		
	}

	@Override
	public List<Farmer> getAll() {
		// TODO Auto-generated method stub
		return (List<Farmer>) farmeRepository.findAll();
	}

}
