package mohammadAamir;

public class Palindrome {

	public static void main(String[] args) {
		char []s={'a','m','a'};
		int i=0;
	       int j=s.length-1;
	       while(i<=j)
	        {
	       char temp=s[i];
	       s[i]=s[j];
	       s[j]=temp;
	        i++;
	        j--;
	       }

	}

}
