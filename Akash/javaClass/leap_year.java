package javaClass;

import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		
		leapyear(year);

	}

	public static void leapyear(int year) {
		// TODO Auto-generated method stub
		
		if(year%4==0 || (year%100==0) || (year%400==0)) {
					System.out.println("leap year");
				}
				else {
					System.out.println("Not a leap year");
				}
			}
		

		
	}


