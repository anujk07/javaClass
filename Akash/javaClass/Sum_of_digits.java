package javaClass;

import java.util.Scanner;

public class Sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		SOM(n);

	}

	public static void SOM(int n) {
		// TODO Auto-generated method stub
		
		int sum=0;
		while(n>0) {
		int	rem=n%10;
		sum=sum+rem;
		n=n/10;
			
		}
		System.out.println(sum);
		
	}

}
