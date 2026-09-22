package Basic_Recursion;

public class ArraySum {
    static  int i = -1;
    public int arraySum(int[] nums){
        if(nums.length-1 <= i){
            i = -1;
            return 0;
        }
        i++;
        return nums[i]+arraySum(nums);
    }
    public static void main(String[] args) {
        ArraySum as = new ArraySum();
        int [] nums = {5,8,1};
        System.out.println(as.arraySum(nums));
    }
}

