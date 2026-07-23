package TCS;

import java.util.HashMap;
public class TcsQue1{
	public static int FirstUniqEle(int [] nums){
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++){
			map.put(nums[i],map.getOrDefault(nums[i],0)+1);
		}

		for(int i=0;i<nums.length;i++){
			if(map.get(nums[i]) == 1){
				return nums[i];
			}
		}
		return -1;
	}
	public static void main(String args[]){
		int [] nums = {1,2,3,2,1,4,5,5,6};
		System.out.println(FirstUniqEle(nums));	
	}
}
