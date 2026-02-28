package Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutive {
    public static int longestConsecutive(int[] nums) {
        int longestlength = 0;
        Map<Integer,Boolean> explore = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            explore.put(nums[i], false);
        }

        for(int i=0;i<nums.length;i++){
            int currentSum = 1;
            int nextNum = nums[i]+1;
            while(explore.containsKey(nextNum) && explore.get(nextNum)==false){
                currentSum++;
                explore.put(nextNum, true);
                nextNum++;
            }
            int prevnum = nums[i]-1;
            while (explore.containsKey(prevnum) && explore.get(prevnum)==false) {
                currentSum++;
                explore.put(prevnum, true);
                prevnum--;
            }
            longestlength = Math.max(longestlength , currentSum);
        }
        return longestlength;
    }
    public static void main(String[] args) {
        int [] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(longestConsecutive(nums));
    }
}

