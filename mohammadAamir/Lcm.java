package mohammadAamir;

public class Lcm {

	public static void main(String[] args) {
		      long A= 5;
		      long B=10;
		         long[] arr = new long[2];
		        
		        long g = gcd(A,B);
		        long l = (A*B)/g;   
		        
		      
		       System.out.println(l); 
		       
		    }
		    
		    static long gcd(long a, long b)
		    {
		        if(a == 0)
		          return b;
		          
		        return gcd(b%a, a);
		    }

	}


