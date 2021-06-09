package com.divergentsl.cms_springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.divergentsl.cms_springboot.controller.LoginAdminPanel;
import com.divergentsl.cms_springboot.dao.LoginDaoI;
import com.divergentsl.cms_springboot.details.AdminDetailPrinciple;
import com.divergentsl.cms_springboot.model.LoginAdmin;
import com.divergentsl.cms_springboot.repository.AdminRepository;
@Service
public class LoginAdminServiceImpl implements LoginAdminService,UserDetailsService {

	
	@Autowired 
	LoginDaoI ldi;
	
	@Autowired
	private AdminRepository repo;
	
	
	@Override
	public boolean adminLogin(LoginAdmin loginAdmin) {
        //LoginAdmin lao = new LoginAdmin();
		loginAdmin.getUsername();
		loginAdmin.getPassword();
		System.out.println(loginAdmin.getPassword());
		return ldi.checkAdmin(loginAdmin);
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		LoginAdmin loginAdmin = repo.findByUsername(username);
		
		if(loginAdmin==null)
		{
			throw new UsernameNotFoundException("Admin 404");
		}
		return new AdminDetailPrinciple(loginAdmin);
	}

}
