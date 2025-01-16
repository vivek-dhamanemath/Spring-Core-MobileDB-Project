package com.jsp.springcore.layers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.springcore.layers.controler.MobileControler;

import java.util.Scanner;

public class App 
{
	public static void main( String[] args )
	{
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		MobileControler mobileControler = ac.getBean(MobileControler.class);
		Scanner sc = new Scanner(System.in);
		boolean exit = false;

		while (!exit) {
			System.out.println("Choose an option:");
			System.out.println("1. Add Mobile");
			System.out.println("2. Find Mobile by ID");
			System.out.println("3. Update Mobile");
			System.out.println("4. Delete Mobile");
			System.out.println("5. Find All Mobiles");
			System.out.println("6. Exit");

			int choice = sc.nextInt();

			switch (choice) {
				case 1:
					mobileControler.addMobile();
					break;
				case 2:
					mobileControler.findMobile();
					break;
				case 3:
					mobileControler.updateMobile();
					break;
				case 4:
					mobileControler.deleteMobile();
					break;
				case 5:
					mobileControler.findAllMobile();
					break;
				case 6:
					exit = true;
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
			}
		}
		sc.close();
	}
}
