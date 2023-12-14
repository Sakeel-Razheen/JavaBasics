package com.Javacourse;

import java.time.LocalDate;
import java.util.Date;

public class JavaReferenceType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String name =new String("Sakeel razheen");
      Date date=new Date();
      java.sql.Date da=new java.sql.Date(1);
      System.out.println(name.toUpperCase());
      System.out.println(name.charAt(1));
      System.out.println(name.contains(name));
      LocalDate now = LocalDate.now();
      System.out.println(now.getMonthValue());
      System.out.println(now.getYear());
      
	}

}
