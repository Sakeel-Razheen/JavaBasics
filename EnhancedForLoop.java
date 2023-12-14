package com.Javacourse;

import java.util.Arrays;

import javax.xml.stream.events.Namespace;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] numbers= {1,2,5,4,78,56,100};
         
         for(int i=0;i<numbers.length;i++) {
        	 System.out.println(numbers[i]);
         }//in this method we can change the index
         System.out.println("enhanced loops");
         for(int num:numbers) {
        	 System.out.println(num);
         }//inn this method it gives the exact output
         
         
         String [] name= {"karthick", "kamal","albie","alan"};
         for(int i=0;i<name.length;i++) {
        	 System.out.println(name[i]);
         }
         
         for(String n:name) {
        	 System.out.println(n);
         }
         for(int i=numbers.length-1;i>=0;i--) {
        	 System.out.println(numbers[i]);//to print the elements in the arrays reverse
         }
         Arrays.stream(numbers).forEach(System.out::println);
         
         
         
         //break and continue 
         for(String names:name) {
        	 if(names.equals("kamal")) {
        		 break;
        	 }
        	 System.out.println(names);
         }
         for(String names:name) {
        	 if(names.startsWith("k")) {
        		 continue;
        	 }
        	 System.out.println(names);
	}
	}
}
