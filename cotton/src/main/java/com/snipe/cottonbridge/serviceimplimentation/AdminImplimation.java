package com.snipe.cottonbridge.serviceimplimentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snipe.cottonbridge.dao.AdminRepository;
import com.snipe.cottonbridge.model.Admin;
import com.snipe.cottonbridge.serviceinterface.AdminInterface;


@Service
public class AdminImplimation implements AdminInterface{
	
	
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public void saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminRepository.save(admin);
		
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.save(admin);
	}

	@Override
	public void deleteAdmin(int id) {
		// TODO Auto-generated method stub
		adminRepository.deleteById(id);
		
	}

	@Override
	public List<Admin> getAll() {
		// TODO Auto-generated method stub
		return (List<Admin>) adminRepository.findAll();
	}

}
