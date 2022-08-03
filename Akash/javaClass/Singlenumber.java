package javaClass;

import java.util.Scanner;

public class Singlenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr =new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		singlenumber(arr);
	//	singlenumber1(arr);
	//	singlenumber2(arr);

	}

	public static void singlenumber2(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<arr.length;i++) {
			int n=0;
			for(int j=1;j<arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					n=1;	
				}
			}
			if(n==0) {
				System.out.println(arr[i]);
			}
			

	public static void singlenumber(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<arr.length;i++) {
			arr[0]^= arr[i];
		}
		System.out.println(arr[0]);	
	}

	public static void singlenumber1(int[] arr) {
		// TODO Auto-generated method stub
		
		int out=0;
		for(int i:arr) {
			out^=i;
		}
		//return out;
		System.out.println(out);
		
		
	}

}
