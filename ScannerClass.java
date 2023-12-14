package com.Javacourse;

import java.time.LocalDate;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your name : ");
        String name=sc.nextLine();
        
        System.out.println("Hi "+name);
        System.out.println("What is your Age : ");
        int age=sc.nextInt();
        int year=LocalDate.now().minusYears(age).getYear();
        System.out.println("Your age is "+age+" and you are born in "+year);
        
        
        if(age>=18) {
        	System.out.println("You are an adult :)");
        }else {
        	System.out.println("You are not an adult :(");
        }
	}

}
