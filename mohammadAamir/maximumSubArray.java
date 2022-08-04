package mohammadAamir;

public class maximumSubArray {

	public static void main(String[] args) {
		int[]nums= {5,-2,5,-1}
		 int max=Integer.MIN_VALUE;
	        int maxhere=0;
	        for(int i=0;i<nums.length;i++){
	            maxhere=maxhere+nums[i];
	            if(maxhere>max){
	                max=maxhere;
	            }
	            if(maxhere<0){
	                maxhere=0;
	            }
	        }
	        System.out.println(max);

	}

}
