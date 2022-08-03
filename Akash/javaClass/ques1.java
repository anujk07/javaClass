package javaClass;

import java.util.Scanner;

public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>=0) {
			int n=s.nextInt();
			if(15<n) {
				System.out.print("No");
			}
			else {
				System.out.print("Yes");
			}
		}
	}
}