package com.jsp.springcore.layers.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jsp.springcore.layers.services.MobileService;

@Controller
public class MobileControler {
	
	@Autowired
	private MobileService mobileService;
	
	public void addMobile() {
		mobileService.addMobile();
	}
	
	public void findMobile() {
		mobileService.findMobileById();
	}

	public void updateMobile() {
		mobileService.updateMobile();
	}

	public void deleteMobile() {
		mobileService.deleteMobile();
	}	

	public void findAllMobile() {
		mobileService.findAllMobile();
	}

}
