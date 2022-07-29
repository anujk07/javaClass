import java.util.*;
public class sum{
    public static void main(String[] args){
        int n,d,sum=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        while (n>0){
            d=n%10;
            sum= sum+d;
            n=n/10;
        }
        sc.close();
        System.out.println(sum);

    }
}