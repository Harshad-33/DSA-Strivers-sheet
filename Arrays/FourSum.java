package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;

            for(int j=i+1;j<n;){
                int p = j+1, q = n-1;

                while(p<q){
                    long sum = (long) nums[i] + nums[j] + nums[p] + nums[q];
                    if(sum < target){
                        p++;
                    }else if(sum > target){
                        q--;
                    }else{
                        result.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
                        p++;q--;
                        while (p < q && nums[p] == nums[p - 1]) p++;
                        while (p < q && nums[q] == nums[q + 1]) q--;
                    }
                }
                j++;
                while( j<n && nums[j]==nums[j-1]) j++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int [] nums = {-2,-1,-1,1,1,2,2};
        int target = 0;
        System.out.println(fourSum(nums, target));
    }
}

