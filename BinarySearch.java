package com.bl.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		String[] a = {"Mango", "Grapes", "Papaya", "Orange", "Apple", "PineApple"}; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word that you want to search");
		String word = sc.next();
		
		System.out.println("Array before sorting: ");
		for(int i = 0;  i < a.length; i++) {
		     System.out.print(a[i]+ " ");
		     }
		System.out.println();
		//Sorting the array
	     Arrays.sort(a);
	     System.out.println("Array after sorting: ");
	     for(int i = 0;  i < a.length; i++) {
	     System.out.print(a[i]+ " ");
	     }
	     System.out.println();
	     
		int result = Arrays.binarySearch(a,word);
		if (result < 0)
			System.out.println("Word is not found");
		else {
			System.out.println("Word is found at index: " +result);
		}
	}
}
