package com.parantheses.code;

import java.util.Scanner;

public class Main {
	
	public static int pairOfParantheses(String inputString) {
		int openBraces = 0;
		int closeBraces = 0;
		for(int i=0; i<inputString.length(); i++) {
			if(inputString.charAt(i)=='{') { 
				openBraces++;
			}
			if(inputString.charAt(i)=='}' && openBraces > 0) { 
				closeBraces++;
				openBraces--;
			}
			
		}
		return closeBraces;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String inputValue = sc.nextLine();
		Integer result = pairOfParantheses(inputValue);
		System.out.println("The result is : "+result);

	}

}
 