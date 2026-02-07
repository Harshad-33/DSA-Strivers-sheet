package Arrays;

public class RemoveDuplic {
    public static int removeDuplicates(int[] nums) {
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] nums = {1,1,2};
        int k = removeDuplicates(nums);
        System.out.println(k);
        for(int i=0;i<k;i++){
            System.out.print(nums[i]+" ");
        }
    }
}

