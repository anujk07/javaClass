package javaClass;

public class missingNum {
	 public int missingNumber(int[] nums) {
	        int result = 0;
	        int n=nums.length;
	        for(int i = 0; i<=n; i++){
	            result = result^i;
	            
	        }
	        for(int j = 0; j<n; j++){
	            result = result^nums[j];
	        }
	        return result;
	        
	    }
	}

