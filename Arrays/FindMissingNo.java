package Arrays;
import java.util.Scanner;

public class FindMissingNo {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int fn = (n*(n+1))/2;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        return fn-sum;
    }
    public static void main(String[] args) {
        int [] nums = {0,1,2,4,5,6};
        FindMissingNo fm = new FindMissingNo();
        System.out.print(fm.missingNumber(nums));
    }
}
