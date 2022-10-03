package com.bl.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Anagram am = new Anagram();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First string: ");
		String str1 = sc.next();
		
		System.out.println("Enter First string: ");
		String str2 = sc.next();
		am.checkAnagram(str1, str2);
	}
	
	public void checkAnagram(String str1, String str2) {
		if(str1.length() != str2.length()) {
			System.out.println("str1 and str2 are not anagram");
			return;
			}
		
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		if(Arrays.equals(charArray1, charArray2)) {
			
				System.out.println("str1 and str2 are anagram");
			}
		else {
				System.out.println("str1 and str2 are not anagram");
			}
	}
}

