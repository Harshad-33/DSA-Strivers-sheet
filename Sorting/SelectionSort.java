package Sorting;

public class SelectionSort {
    public static int[] selectionSort(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            int min_idx = i;
            for(int j=i+1;j<n;j++){
                if(nums[j] < nums[min_idx]){
                    min_idx = j;
                }
            }
            int temp = nums[min_idx];
            nums[min_idx] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {2,5,3,7,1,4};
        selectionSort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}

