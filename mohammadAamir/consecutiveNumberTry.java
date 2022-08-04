package mohammadAamir;

public class consecutiveNumberTry {

	public static void main(String[] args) {
		int [] nums= {1,5,3,4,6};
		 int max = 0;
	        int currCt = 1;
	        int lastN = nums[0];
			
	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] == lastN + 1) {
	                currCt++;
	            } else if (nums[i] != lastN) {
	                currCt = 1;
	            }
	            
	            if (currCt > max) {
	                max = currCt;
	            }
	            lastN = nums[i];
	        }
	        System.out.println(max);

	}

}
