package com.wipro.bank.main;

import com.wipro.bank.service.BankService;
import java.util.Scanner;
public class MainClass {
	public static void main(String a[])
	{
	                Scanner s = new Scanner(System.in);
		 			int tenure;
	                float principal;
	                int age;
	                String gender;
	                principal=s.nextFloat();
	                age=s.nextInt();
	                gender=s.next();
	                tenure=s.nextInt();
	                BankService b=new BankService();
	                b.calculate(principal,tenure,age,gender);
	}


}
