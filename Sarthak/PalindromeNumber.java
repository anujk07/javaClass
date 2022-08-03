package Sarthak;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
//		Pali(n);
		if(pali(n)==true) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
//	public static void Pali(int n) {
//		int x=n;
//		int sum=0;
//		while(n!=0) {
//			int rev=n%10;
//			sum=sum*10+rev;
//			n=n/10;
//		}
////		System.out.println(sum);
//		if(x==sum) {
//			System.out.println("Palindrome");
//		}
//		else {
//			System.out.println("Not Palindrome");
//		}
//	}
	
	
//        Alternate Method: convert the number into String 
     public static boolean pali(int n) {
    	 String str=Integer.toString(n);
    	 int i=0;
    	 int j=str.length()-1;
    	 while(i<j) {
    		 if(str.charAt(i)!=str.charAt(j)) {
    			 return false;
    		 }
    		 i++;
    		 j--;
    	 }
    	 return true;
     }
}
