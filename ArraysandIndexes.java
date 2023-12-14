package com.Javacourse;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysandIndexes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int [] num = {1,2,3,50,80,95};
          int num1=num[num.length-4];
          System.out.println(num1);
         
          System.out.println(Arrays.toString(num));
          System.out.println(Array.getLength(num));
          String name []= {"Ram","Abdul"};
          System.out.println(Arrays.toString(name));
          System.out.println(Array.getLength(name));
          
	}

}
