package javaClass;
import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
	//	int[] arr = { 4,2,-18,45,30  };
	    Bubblesort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}
	public static void Bubblesort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0;j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
