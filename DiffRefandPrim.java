package com.Javacourse;

public class DiffRefandPrim {
	public static void main(String[] args) {
		
		int a=10;//value 10 is stored in address of a 
		int b=a;//value a is stored in another address of b
	    a=100;// value 10 of a is replaced with 100 in memory address of a
	    
	    System.out.println("a="+a+"b="+b);
	    /*gives a output of a as 100 and b as 10 since
	     * address b is unchanged and address a is changes 
	     */
	
	    Person alex=new Person("Alex");
	    /*Alex is the object and alex is the 
	     * refernce that point to the object
	     */
	    Person maryam=alex;
	    /*maryam is another reference that 
	     * points the same object as alex
	     */
	    System.out.println("for ref alex-"+alex+"for ref maryam-"+maryam);
	    /*both ref gives the same object as output
	    /*now i'm gonna change the object value
	    */
	    alex.name="Alexander";
	    System.out.println("after changing the object value");
	    System.out.println("for ref alex-"+alex+"for ref maryam-"+maryam);
	    /*now we can see that both the reference type points
	     *  the same obeject even after changing the value
	     */
	    
	} 

	public static class Person{
	    	
	    	String 	name;
	    	Person(String name) {
	    		this.name=name;
	    		
	    	}
	    	
	 
}}
		
	
	

