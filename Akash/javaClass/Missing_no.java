package javaClass;

import java.util.Scanner;

public class Missing_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {3,0,1};
		
	//	Scanner sc=new Scanner(System.in);
	//	int n=sc.nextInt();
	//	int [] arr =new int[n];
	//	for(int i=0;i<arr.length;i++) {
	//		arr[i]=sc.nextInt();
		
		missingno(arr);
		
	}
	public static void missingno(int [] arr) {
		// TODO Auto-generated method stub
		
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println((arr.length+1)*arr.length/2-sum);

	}

		
	}


