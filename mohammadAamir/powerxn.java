package mohammadAamir;

public class powerxn {

	public static void main(String[] args) {
		 long n=5;
		 int x=3;
    double ans=1.0;
    long temp=n;
    if (temp<0) temp=-1 *temp;
    while(temp>0){
        if(temp%2==1){
            ans=ans*x;
            temp=temp-1;
        }
        else{
            x=x*x;
            temp=temp/2;
        }
    }
    if(n<0) ans=(double)(1.0)/(double)(ans);
    
    System.out.println(ans);

	}

}
