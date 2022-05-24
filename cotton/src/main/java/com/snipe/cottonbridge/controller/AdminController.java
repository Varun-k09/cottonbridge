package com.snipe.cottonbridge.controller;

import java.util.List;

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
import com.snipe.cottonbridge.serviceimplimentation.AdminImplimation;

@RestController
@CrossOrigin("*")
public class AdminController {

	@Autowired
	private AdminImplimation adminaimplimaentation;
	@PostMapping(value = "saveAdmin")
	public String addAdmin(@RequestBody Admin admin){
		System.out.println("add new admin ");
		adminaimplimaentation.saveAdmin(admin);
		
		return "new admin added successfuly";
	}
	
	@PutMapping(value = "updateAdmin")
	public Admin updateAdmin(@RequestBody Admin admin) {
		System.out.println("values updated successfully to admin");
		return adminaimplimaentation.updateAdmin(admin);
	}
	
	@DeleteMapping(value = "deleteAdmin")
	public String  deleteAdmin(@RequestParam Integer id) {
		System.out.println("at delete employee");
		 adminaimplimaentation.deleteAdmin(id);
		return "Admin deleted";
	}
	
	@GetMapping(value = "findAllAdmin")
	public List<Admin> findAllEmployee(){
		return adminaimplimaentation.getAll();
	}
}
