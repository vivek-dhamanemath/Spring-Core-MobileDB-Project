package com.jsp.springcore.layers.services;

import java.util.Scanner;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springcore.layers.entity.Mobile;
import com.jsp.springcore.layers.repositry.MobileRepository;

@Service
public class MobileService {

	Scanner sc = new Scanner(System.in);

	@Autowired
	private MobileRepository mobileRepository;

	public void addMobile() {

		Mobile mobile = new Mobile();

		System.out.println("Enter the mobile id:");
		mobile.setMobileId(sc.nextInt());

		System.out.println("Enter the mobile Model:");
		mobile.setMobileModel(sc.next());

		System.out.println("Enter the mobile Brand:");
		mobile.setMobileBrand(sc.next());

		System.out.println("Enter the mobile price:");
		mobile.setMobilePrice(sc.nextInt());

		mobileRepository.addMobile(mobile);

		System.out.println("Data inserted");

	}

	public void findMobileById() {
		System.out.println("Enter the mobile id:");
		Mobile mobile = mobileRepository.findMobileById(sc.nextInt());

		if(mobile!= null) {
			System.out.println("mobile found succesfully");
			System.out.println(mobile);
		}else {
			System.err.println("mobile not found by id");
		}
	}

	public void updateMobile() {
		System.out.println("Enter the mobile id:");
		Mobile mobile = mobileRepository.findMobileById(sc.nextInt());

		if(mobile!= null) {
			System.out.println("mobile found succesfully");
			System.out.println(mobile);

			System.out.println("Enter the mobile Model:");
			mobile.setMobileModel(sc.next());

			System.out.println("Enter the mobile Brand:");
			mobile.setMobileBrand(sc.next());

			System.out.println("Enter the mobile price:");
			mobile.setMobilePrice(sc.nextInt());

			mobileRepository.updateMobile(mobile);

			System.out.println("Data updated");
		}else {
			System.err.println("mobile not found by id");
		}
	}

	public void deleteMobile() {
		System.out.println("Enter the mobile id:");
		Mobile mobile = mobileRepository.findMobileById(sc.nextInt());

		if(mobile!= null) {
			System.out.println("mobile found succesfully");
			System.out.println(mobile);

			mobileRepository.deleteMobile(mobile.getMobileId());

			System.out.println("Data deleted");
		}else {
			System.err.println("mobile not found by id");
		}
	}

	public void findAllMobile() {
		List<Mobile> mobile = mobileRepository.findAllMobile();
		for (int i = 0; i < mobile.size(); i++) {
			System.out.println(mobile.get(i));
		}
	}


}
