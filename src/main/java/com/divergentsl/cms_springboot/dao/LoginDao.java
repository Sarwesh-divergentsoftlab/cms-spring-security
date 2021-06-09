package com.divergentsl.cms_springboot.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.divergentsl.cms_springboot.model.Doctor;
import com.divergentsl.cms_springboot.model.LoginAdmin;

@Repository
public class LoginDao implements LoginDaoI {
	@PersistenceContext
	private EntityManager em;

	LoginAdmin looginAdmin1 = new LoginAdmin();
	
	Doctor loginDoctor1=new Doctor();
	
//	

	@Override
	public boolean checkAdmin(LoginAdmin loginAdmin) {
		// TODO Auto-generated method stub
	
		
		loginAdmin.getUsername();
		loginAdmin.getPassword();
		looginAdmin1=em.find(LoginAdmin.class, loginAdmin.getUsername());
		System.out.println();
//		System.out.println(loa.getUsername()+" "+loa.getPassword()+" "+loa1.getUsername()+" "+loa1.getPassword());
		if(loginAdmin.getUsername().equals(looginAdmin1.getUsername()) && loginAdmin.getPassword().equals(looginAdmin1.getPassword()))
		{
			System.out.println("login success");
			return true;
		}
		
		
	


		return false;
	}

@Override
public boolean checkDoctor(Doctor loginDoctor) {
	// TODO Auto-generated method stub
	try {
	loginDoctor1= em.find(Doctor.class, loginDoctor.getDoctor_id());
	System.out.println(loginDoctor1.getDoctor_id()+" "+loginDoctor1.getUsername());
	if(loginDoctor.getDoctor_id().equals(loginDoctor1.getDoctor_id()) && loginDoctor.getPassword().equals(loginDoctor1.getPassword()))
	{
	return true;
	}
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return false;
}

}
