package Sarthak.Assignment;

import java.util.Scanner;

public class GcD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int divident=s.nextInt();
		int divisor =s.nextInt();
		
		gcd(divident,divisor);
		System.out.println(GCD(divident,divisor));
	}
	
	public static void gcd(int divident,int divisor) {
		while(divident%divisor!=0) {
			int rem= divident%divisor;
			divident=divisor;
			divisor=rem;
		}
		System.out.println(divisor);
	}
	
               //	Alternate Method
	
	public static int GCD(int a,int b) {
		int result=Math.min(a, b);
		while(result>0) {
			if(a%result==0 && b%result==0) {
				break;
			}
			result--;
		}
		return result;
	}
	
	
             //   Alternate Method 
}
