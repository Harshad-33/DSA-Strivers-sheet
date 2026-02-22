package Arrays;
public class SortColors {
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int i = 0;
        int high = n-1;
        while(i<=high){
            if(nums[i]==0){
                int temp = nums[low];
                nums[low] = nums[i];
                nums[i] = temp;
                low++;
                i++;
            }else if(nums[i] == 1){
                i++;
            }else {
                int temp = nums[high];
                nums[high] = nums[i];
                nums[i] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int [] nums = {2,0,2,1,1,0};
        sortColors(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}

