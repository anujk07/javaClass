package mohammadAamir;

import java.util.HashMap;

//Time Complexity:O(N)
//Space Complexity:O(N)

public class goodPairsOptimize {

	public static void main(String[] args) {
		int []nums = {1,2,3,1,1,2};
		 int count=0;
         HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
        if(map.containsKey(num)){
        count+=map.get(num);
         map.put(num,map.get(num)+1);
             }
              else{
         map.put(num,1);
            }
          }
     System.out.println(count);

	}

}
