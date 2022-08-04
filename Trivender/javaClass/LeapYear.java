package javaClass;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       checkLeapYear(n);
    }
 
 public static void checkLeapYear(int n)
    {
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
