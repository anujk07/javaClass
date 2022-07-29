package javaClass;

public class CountWord {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="hello world bye";
		countword(str);

	}

	public static void countword(String str) {
		// TODO Auto-generated method stub
		
		int count=1;
		for(int i=0;i<str.length(); i++) {
			if(str.charAt(i)== ' '&&(str.charAt(i+1)!=' ')){
				count++;
			}
		}
		System.out.println(count);
		
	}

}
