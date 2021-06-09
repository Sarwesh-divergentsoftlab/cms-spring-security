package com.divergentsl.cms_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.divergentsl.cms_springboot.model.LoginAdmin;

public interface AdminRepository extends JpaRepository<LoginAdmin, String> {

	  LoginAdmin findByUsername(String username);
}
