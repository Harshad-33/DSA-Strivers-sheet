package Arrays;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int insertpos = 0;
        for(int i=0;i<n;i++){
            if(nums[i] != 0){
                nums[insertpos] = nums[i];
                insertpos++;
            }
        }
        for(int i=insertpos;i<n;i++){
            nums[insertpos] = 0;
            insertpos++;
        }
    }
    public static void main(String[] args) {
        int []nums = {0,1,0,3,5,0,12};
        moveZeroes(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}


