public class Int_palindrome {
    public static boolean main(int x) {
        if (x < 0) {
            return false;
        }
       int num = x;
       int reverse = 0;
        while (num > 0) {
            reverse = reverse * 10+num%10;
            num /= 10;
        }
        return x == reverse;
        
    }
}
