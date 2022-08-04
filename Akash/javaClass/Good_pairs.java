package javaClass;

import java.util.*;

public class Good_pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr =new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
			goodpair(arr);
			
		}

	}

	public static int goodpair(int[] arr) {
		// TODO Auto-generated method stub
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				
			}
		}
		 return count;
		
	}

}
