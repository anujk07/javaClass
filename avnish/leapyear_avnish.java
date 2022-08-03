import java.util.*;

public class leapyearbirthday {

    public static void main(String[] args) {
        int y;
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();

        if (y%4==0)
            System.out.println("it's a leap year");
        else
            System.out.println("it is not a leap year");
    }

}