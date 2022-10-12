package com.bl;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 1000; i++) {
			list.add(i);
		}
		System.out.println(list);
		primeNumbers(list);
//		for(int i = 1; i < 1000; i++) {
//			System.out.println(+i+ " " +isPrime(i)+ " ");
//		}

		System.out.println(isPrime(34));
	}

	public static List<Integer> primeNumbers(List<Integer> list) {
		List<Integer> newList = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			int num = list.get(i);

			for (int j = 1; j <= num; j++) {
				if (num % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				newList.add(num);
			}
		}
		System.out.println(newList);
		return newList;
	}

	public static boolean isPrime(int num) {
		int count = 0;
		for (int j = 1; j <= num; j++) {
			if (num % j == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		}
		System.out.println();
		return false;
	}
}
