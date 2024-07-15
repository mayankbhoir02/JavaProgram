package com.gvacharya.selectionsort;

public class SelectionSort {


	public static void main(String[] args) {

		int[] array = { 4, 3, 5, 1, 2 };
		int size = array.length;
		int key;

		System.out.println("Before Sorting: ");
		for(int number:array)
			System.out.println(number + " ");
		
		System.out.println();
		
		for (int i = 0; i < size; i++) {
			key = i;
			for (int j = i+1; j < size; j++) {
				if (array[key] > array[j])
					key = j;
			}
//
//			int temp = array[i];
//			array[i] = array[key];
//			array[key] = temp;
			if(key!=i) {
			array[key] = array[key] + array[i];
			array[i] = array[key] - array[i];
			array[key] = array[key] - array[i];
			}
		}
		
		System.out.println("After Sorting: ");
		for(int number:array)
			System.out.println(number + " ");
	}
}
