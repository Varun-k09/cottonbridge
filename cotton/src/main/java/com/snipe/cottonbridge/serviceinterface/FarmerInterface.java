package com.snipe.cottonbridge.serviceinterface;

import java.util.List;

import com.snipe.cottonbridge.model.Admin;
import com.snipe.cottonbridge.model.Farmer;

public interface FarmerInterface {
	
	public void saveFarm(Farmer farmer );
	public Farmer updateFarm(Farmer farmer);
	public void deleteFarm( int id);
	public List<Farmer> getAll();

}
