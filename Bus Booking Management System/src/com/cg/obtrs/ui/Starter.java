package com.cg.obtrs.ui;

import java.util.Random;
import java.util.Scanner;

import com.cg.obtrs.dao.StaticDb;
import com.cg.obtrs.dto.CustomerDTO;
import com.cg.obtrs.service.CustomerService;
import com.cg.obtrs.service.CustomerServiceImpl;

public class Starter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     int x=1;
		CustomerService custService = new CustomerServiceImpl();
		 while(x>0)
	      {
      System.out.println("1. Login as Admin");
      System.out.println("2.Customer");
      int choice = sc.nextInt();
     
      switch(choice)
      {
      case 1: 
             
      case 2 : System.out.println("1. Login");
               System.out.println("2.Sign Up");
               int custChoice = sc.nextInt();
               switch(custChoice)
               {
               case 1:
            	   System.out.println("Enter Username");
            	      String userName = sc.next();
            	      System.out.println("Enter Password");
            	      String password = sc.next();
            	      System.out.println("Enter your Name");
            	      String name = sc.next();
            	      System.out.println("Enter Phone number");
            	      long phoneNo = sc.nextLong();
            	      System.out.println("Enter Email ID");
            	      String email = sc.next();
            	      Random random = new Random();
            	      int custId =  random.nextInt(1000);
            	     System.out.println(custService.customerSignUp(new CustomerDTO(name, phoneNo, email, custId, userName, password))); 
               }
               
      
    	  
    	  System.out.println("Enter Username");
              userName = sc.next();
              System.out.println("Enter Password");
              password = sc.next();
              System.out.println(custService.customerLoginIn(userName, password));
      
      case 3: System.out.println("Enter Current Password");
      }
	}}

}
