package javaClass;

import java.util.Scanner;

public class Nondecreasing_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr =new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		nondecresing(arr);
	}

	public static boolean nondecresing(int[] arr) {
		// TODO Auto-generated method stub
		
		int n = -1;
		for(int i=0;i<=arr.length-1; i++) {
			if(arr[i-1]<arr[i]) {
				
				if (n != -1) {
					return false;
					
				}
				n=i;
			}
		}
	//	return true;	
			
		return n==0|| n==arr.length-2 || arr[n-1]<=arr[n+1] || arr[n]<=arr[n+2];
		
	}

}
