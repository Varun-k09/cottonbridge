package com.snipe.cottonbridge.serviceinterface;

import java.util.List;

import com.snipe.cottonbridge.model.Admin;

public interface AdminInterface {
	
	public void saveAdmin(Admin admin);
	public Admin updateAdmin(Admin admin);
	public void deleteAdmin( int id);
	public List<Admin> getAll();

}
