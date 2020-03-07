package com.cg.obtrs.ui;

import java.util.Random;
import java.util.Scanner;

import com.cg.obtrs.dao.StaticDb;
import com.cg.obtrs.dto.AdminDTO;
import com.cg.obtrs.dto.CustomerDTO;
import com.cg.obtrs.service.AdminService;
import com.cg.obtrs.service.AdminServiceImpl;
import com.cg.obtrs.service.CustomerService;
import com.cg.obtrs.service.CustomerServiceImpl;

public class Starter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	     int temp=1;
		CustomerService custService = new CustomerServiceImpl();
		AdminService adminService = new AdminServiceImpl();
		 while(temp>0)
	      {
      System.out.println("1. Login as Admin");
      System.out.println("2. Login as Customer");
      int choice = input.nextInt();
     
      switch(choice)
      {
      case 1: System.out.println("1. Sign Up");
      		 System.out.println("2. LogIn");
      		 int adminChoice= input.nextInt();
      		 switch(adminChoice)
      		 {
      		 case 1:
      		  System.out.println("Enter Username");
       	      String userName = input.next();
       	      System.out.println("Enter Password");
       	      String password = input.next();
       	      System.out.println("Enter your Name");
       	      String name = input.next();
       	      System.out.println("Enter Phone number");
       	      long phoneNo = input.nextLong();
       	      System.out.println("Enter Email ID");
       	      String email = input.next();
       	      Random random = new Random();
       	      int custId =  random.nextInt(1000);
       	     System.out.println(adminService.adminSignUp(new AdminDTO(name, phoneNo, email, custId, userName, password))); 
                  break;
          case 2:  
          System.out.println("Enter Username");
          userName = input.next();
          System.out.println("Enter Password");
          password = input.next();
          System.out.println(adminService.adminLogin(userName, password));
	  
      		 }
             break;
      case 2 : System.out.println("1. Sign Up");
               System.out.println("2. LogIn");
               int custChoice = input.nextInt();
               switch(custChoice)
               {
               case 1:
            	   System.out.println("Enter Username");
            	      String userName = input.next();
            	      System.out.println("Enter Password");
            	      String password = input.next();
            	      System.out.println("Enter your Name");
            	      String name = input.next();
            	      System.out.println("Enter Phone number");
            	      long phoneNo = input.nextLong();
            	      System.out.println("Enter Email ID");
            	      String email = input.next();
            	      Random random = new Random();
            	      int custId =  random.nextInt(1000);
            	     System.out.println(custService.customerSignUp(new CustomerDTO(name, phoneNo, email, custId, userName, password))); 
                       break;
               case 2:  
        	   System.out.println("Enter Username");
               userName = input.next();
               System.out.println("Enter Password");
               password = input.next();
               System.out.println(custService.customerLogin(userName, password));
    	  
    	 

      }
	}}

}
}
