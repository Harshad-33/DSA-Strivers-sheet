package Arrays;

public class SecondLargestEle {
    public static int secondLargestElement(int[] nums) {
        int ans = -1;
        int highest = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>highest){
                ans = highest;
                highest = nums[i];
            }else if(nums[i] > ans && nums[i] != highest){
                ans = nums[i];
            }
        }
        if(ans == Integer.MIN_VALUE){
            return -1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] nums = {5,3,2,1};
        System.out.println(secondLargestElement(nums));
    }    
}


