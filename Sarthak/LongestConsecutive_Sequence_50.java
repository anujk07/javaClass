package Sarthak.Sarthak;

import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class LongestConsecutive_Sequence_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(LongestConsecutive(arr));
		System.out.println(longestconsecutive(arr));
	}
	public static int LongestConsecutive(int [] arr) {
		if(arr.length==0) {
			return 0;
		}
		Arrays.sort(arr);
		
		int n=arr[0];
		int max=1;
		int count=1 ;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]==n+1) {
				count++;
			}
			else if(arr[i]!=n){
				count=1;
			}
			n=arr[i];
			max=Math.max(max, count);
		}
		return max;
	}
	
//	        Alternative Method
	
	public static int longestconsecutive(int [] arr) {
		if(arr.length==0) {
			return 0;
		}
		int count=0;
		int temp=0,max=1;
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			if(!set.contains(arr[i]-1)) {
				count=0;
				temp=arr[i];
				while(set.contains(temp)) {
					count++;
					temp++;
				}
				if(max<count) {
					max=count;
				}
			}
			return max;
		}
		return 0;
	}
	
}
