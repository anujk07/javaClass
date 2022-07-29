

public class Max_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	int [] arr=  {-2,1,-3,4,-1,2,1,-5,4};
		int [] arr=  {8,-8,9,-9,10,-11,12};
		maxsubarray(arr);
		System.out.println();

	}

	public static void maxsubarray(int[] arr) {
		// TODO Auto-generated method stub
		
		int n=0;
		int max=arr[0];
		for(int i=0; i<arr.length;i++) {
			n=n+arr[i];
			if(n>max) {
				max=n;
			}
			if(n<0){
				n=0;
			}
			
		}
		//return max;
		System.out.println(max);
		
		
		
	}

}
