public class Reverse {
    public static int main(int x) {

        if (x < 0) {
            return 0;
        }
        int num = x;
        int reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;

        }
        System.out.println("The reverse number is: " + x);
        return 0;
    }

}