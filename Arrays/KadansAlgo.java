package Arrays;

public class KadansAlgo {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i=0;i<n;i++){
            currsum += nums[i];
            maxsum = Math.max(maxsum , currsum);
            if(currsum < 0){
                currsum = 0;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int [] nums = {2, 3, 5, -2, 7, -4};
        System.out.println(maxSubArray(nums));
    }
}

