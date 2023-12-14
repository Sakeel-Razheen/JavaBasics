package com.Javacourse;

public class IfandSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int age = 16;
          
          if(age>=18) {
        	  System.out.println("adult");
        	  
          }else if (age>=16&&age<18) {
        	  System.out.println("almost there");
          }else {
        	  System.out.println("not an adult");
          }
          
          
          
          String gender = "female";
          
          switch (gender){
          case "female" : 
        	  System.out.println("female");
          break;
          case "male" : 
        	  System.out.println("male");
          break;
          case "prefer not to say" : 
        	  System.out.println("prefer not to say");
          break;
          default :	
        	  System.out.println("unknown gender");
          
          }
	}

}
