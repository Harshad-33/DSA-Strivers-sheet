package Sorting;
public class InsertionSort{
    public static int[] InsertionSort(int[] nums) {
        int n = nums.length;
        for(int i=1;i<n;i++){
            int key = nums[i];
            int j = i-1;
            while(j>=0 && nums[j] > key){
                nums[j+1] = nums[j];
                j = j-1;
            }
            nums[j+1] = key;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {2,4,1,5,3,7};
        InsertionSort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}