import java.util.HashSet;

class Solution2 {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int count = 0, temp=0;
        int max = 1;
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i<nums.length; i++) set.add(nums[i]);
        
        for(int i = 0; i< nums.length;i++){
          if(!set.contains(nums[i]-1)){
              count = 0;
              temp = nums[i];
              while(set.contains(temp)){ 
                  count++;
                  temp++;
              }
              
              if(max< count) max = count;
          }   
        }
        return max;
    }
}