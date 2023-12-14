package com.Javacourse;

public class UserDefinedMethod {

	public static void main(String[] args) {
		char [] letters = {'A','A','B','B','C','D','D','D','D'};
		char searchLetter;
		int  count = countOccurance(letters, searchLetter = 'D');
		System.out.println(count);
        	
	}
	public static int countOccurance(char [] letters,char searchLetter) {
		int count = 0;
		for(char letter:letters) {
			if(letter==searchLetter) {
				
				count++;
			}
		}
		
		return count;
	}

}
