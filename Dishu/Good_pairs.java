public class Good_pairs {
    public int numIdenticalPairs(int[] nums) {
        int arr[]= new int[200];
        int ct=0;
        for (int i:nums)
            ct+=arr[i]++;
        return ct;
    }
}
