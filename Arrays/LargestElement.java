package Arrays;
public class LargestElement {
    public static int largestElement(int[] nums) {
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            ans = Math.max(ans , nums[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {3, 3, 0, 99, -40};
        System.out.print(largestElement(nums));
    }
}