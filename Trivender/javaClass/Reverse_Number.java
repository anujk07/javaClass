package javaClass;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=n;
		
		int rev=0;
		int rem;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		//System.out.println(rev);
		if( x==rev) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
