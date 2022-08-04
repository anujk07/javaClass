package Sarthak.Assignment;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
		Leapyear(n);
	}
	public static void Leapyear(int n) {
		if(n%4==0) {
			if(n%100==0) {
				if(n%400==0) {
					System.out.println("Leap Year");
				}
				else {
					System.out.println("Not Leap Year");
				}
			}
			else {
				System.out.println("Leap Year");
			}
		}
		else {
			System.out.println("Not Leap Year");
		}
	}
	}

