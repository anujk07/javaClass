package javaClass;

public class Number_1bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int n= (00000000000000000000000000001011);
	//	int n= (1111111111111111111111111111101);
		int n= (11111111111111111111111111111101);
//		int n= (11101011);
		int count=0;
		while(n!=0) {
			n=n&(n-1);
			count++;
		}
		System.out.println(count);

	}

}
