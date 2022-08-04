package javaClass;

import java.util.Scanner;

public class rotated_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr =new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println(Search(arr,target)); 
	}

	public static int Search(int[] arr, int target) {
		// TODO Auto-generated method stub
		
	//	int n=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
			
			return -1;
		
	}

	}

}
