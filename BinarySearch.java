package com.bl.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = {10, 30, 40, 20, 50, 70, 60}; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key taht you want to search");
		int key = sc.nextInt();
		
		System.out.println("Array before forting: ");
		for(int i = 0;  i < a.length; i++) {
		     System.out.print(a[i]+ " ");
		     }
		System.out.println();
		//Sorting the array
	     Arrays.sort(a);
	     System.out.println("Array after forting: ");
	     for(int i = 0;  i < a.length; i++) {
	     System.out.print(a[i]+ " ");
	     }
	     System.out.println();
	     
		int result = Arrays.binarySearch(a,key);
		if (result < 0)
			System.out.println("Element is not found");
		else {
			System.out.println("Element is found at index: " +result);
		}
	}
//	public void binarySearch(int a[], int first, int last, int key) {
//	}
}
