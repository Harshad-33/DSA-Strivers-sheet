package Arrays;

import java.util.HashMap;

public class TwoSum {
    public static int[] TwoSum(int[] nums , int target){
        int [] result = new int[2];
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int need = target - nums[i];

            if(map.containsKey(need)){
                result[0] = map.get(need);
                result[1] = i;
                return result;
            }

            map.put(nums[i],i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1, 6, 2, 10, 3};
        int target = 7;
        TwoSum(nums, target);
    }
    
}