package com.bl;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Red");
		list.add("Black");
		list.add("White");
		list.add("Blue");
		list.add("Yellow");
		System.out.println(list);
		insertionSort(list);
	}

	public static void insertionSort(List<String> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (list.get(j).compareTo(list.get(j - 1)) < 0) {
					String temp = list.get(j);
					list.set(j, list.get(j - 1));
					list.set(j - 1, temp);
				}
			}
		}
		System.out.println("Sorted Strings are : ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
