package Sorting;

import java.util.*;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [] arr =new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
				Sort(arr);
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
			}

			public static void Sort(int[] arr) {

				for (int i = 1; i < arr.length; i++) {
					int j = i - 1;
					int temp = arr[i];
					while (j >= 0 && arr[j] > temp) {
						arr[j + 1] = arr[j];
						j--;
					}
					j++;
					arr[j] = temp;

				}

		
	}

	}


