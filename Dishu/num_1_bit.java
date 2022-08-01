// Time Complexity = O(n)

public class num_1_bit {
    public int hammingWeight(int n) {
        int total = 0;
        while (n != 0) {
            total += (n % 2) & 1;
            n >>>= 1;

        }

        return total;

    }

}