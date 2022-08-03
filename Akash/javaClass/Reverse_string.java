package javaClass;

import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] arr = str.toCharArray();        
        
        reverse(str);
    
       
	}

	public static void reverse(String str) {
		// TODO Auto-generated method stub
	//	int rev=0;
		String rev = " ";
		for(int i = str.length()- 1; i >= 0; i--) {
	        rev = rev + str.charAt(i);
	        }
	        System.out.println(rev);
		
	}

}
