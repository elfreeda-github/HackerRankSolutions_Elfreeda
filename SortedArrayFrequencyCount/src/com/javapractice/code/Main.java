package com.javapractice.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
 * author: @elfreeda
 */

public class Main {
	
	public static void printFrequencyArray(List<String> tokenList) {
		ArrayList<String> resultList = new ArrayList<>();
		Set<String> distinctValues = new HashSet<>(tokenList);
		for(String s: distinctValues) {
			if(!s.isEmpty()) resultList.add(s +" "+Collections.frequency(tokenList,s));
		}
		Collections.sort(resultList);
		
		for(String result:resultList) {
			System.out.println(result);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");  
		int n = sc.nextInt();
		List<String> array = new ArrayList<>();  
		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<n;i++) {
			array.add(sc.nextLine());
		}
		
		printFrequencyArray(array);

	}

}
