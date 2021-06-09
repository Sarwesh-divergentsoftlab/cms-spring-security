package com.divergentsl.cms_springboot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divergentsl.cms_springboot.dao.LoginDaoI;
import com.divergentsl.cms_springboot.model.Doctor;

@Service
public class LoginDoctorServiceImpl implements LoginDoctorService {
	
	@Autowired
	LoginDaoI loginDaoi;
	@Override
	public boolean doctorLogin(Doctor loginDoctor) {
		// TODO Auto-generated method stub
		loginDoctor.getDoctor_id();
		loginDoctor.getPassword();
		System.out.println(loginDoctor.getPassword());
		return loginDaoi.checkDoctor(loginDoctor);
	}

}
