package com.bl.dsa;

public class BubbleSort {
	    public static void main(String[] args) {
	        String[] a = {"Azhar", "Simran", "Simran", "Muskan", "Afifa"};
//	        int [] a = {5, 25, 12, 45, 100, 58, 79};
	        //bubble sort
	        for(int i = 0; i < a.length - 1; i++)
	        {
	            for(int j = 0; j < (a.length -i -1); j++)
	            {
//	                if(a[j] > a[j + 1]){
	                if(a[j].compareTo(a[j+1]) > 0) {
//	                    int temp = a[j];
	                    String temp = a[j];
	                    a[j] = a[j + 1];
	                    a[j + 1] = temp;
	                }
	            }
	        }
	        printBubble(a);
	    }
//	    public static void printBubble(int[] a){
	    public static void printBubble(String[] a){
	        System.out.println("Bubble sorted array : ");
	        for(int i = 0; i < a.length; i++)
	        {
	            System.out.println(a[i]);
	        }
	    }
}
