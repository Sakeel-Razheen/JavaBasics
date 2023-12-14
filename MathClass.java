package com.Javacourse;

public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println(Math.abs(-50));//turns negative value to positive 
           System.out.println(Math.addExact(1, 1));//adds the value . if  not data type int throws an error
           System.out.println(Math.decrementExact(5));//returns value decrement by 1 
           System.out.println(Math.floor(5.4));//returns the whole number nearest
           System.out.println(Math.getExponent(5.5));
           System.out.println(Math.max(5, 8));//returns the max value
           System.out.println(Math.min(5, 8));//returns the min value
           System.out.println(Math.negateExact(5));//returns +ve value to -ve
           System.out.println((int)Math.pow(5.0, 2.0));//returns the 2 power of 5 value 
           System.out.println((int)Math.sqrt(64));
           System.out.println(Math.PI);
	}

}
