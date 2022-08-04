package Sarthak.Sarthak.Nagarro;

import java.util.Scanner;

public class ToprintNonRepeatedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int [] arr=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		Print(arr);
	}
	public static void Print(int [] arr) {
		int count;
		for(int i=0;i<arr.length-1;i++) {
			count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
//					System.out.println(arr[j]);
					count=1;
					break;
				}
			}
			if(count==0) {
				System.out.println(arr[i]);
			}
			
			}
		
	}
}
