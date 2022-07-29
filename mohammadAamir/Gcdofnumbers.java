package mohammadAamir;

public class Gcdofnumbers {

	public static void main(String[] args) {
		

	
	int arr[]= {2,4,6};
	int N=arr.length;
	 int ans = arr[0];

 	for(int i = 1; i < N; i++)
 		ans = Gcd(ans, arr[i]);

 	System.out.println(ans);
 } 
 
  public static int Gcd(int A , int B) 
 { 
     if (B == 0) 
	        return A; 
	    return Gcd(B, A % B);  
 } 

}
