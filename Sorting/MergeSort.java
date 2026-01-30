package Sorting;

public class MergeSort {
    public static int[] mergeSort(int[] nums) {
        partation(nums , nums.length);
        return nums;
    }

    public static void partation(int[] nums , int numberofElement){

        if(numberofElement < 2){
            return;
        }

        int mid = numberofElement / 2;
        int [] leftpart = new int[mid];
        int [] rightpart = new int[numberofElement - mid];

        for(int i=0;i<mid;i++){
            leftpart[i] = nums[i];
        }

        for(int i=mid;i<numberofElement;i++){
            rightpart[i-mid] = nums[i];
        }

        partation(leftpart , mid);
        
        partation(rightpart , numberofElement - mid);
        
        merge(nums , leftpart , rightpart , mid , numberofElement - mid);
    }

    public static void merge(int[] nums , int [] leftpart , int[] rightpart , int left , int right ){
        int i = 0 , j = 0 , k = 0;

        while(i < left && j < right){
            if(leftpart[i] <= rightpart[j]){
                nums[k++] = leftpart[i++];
            }
            else{
                nums[k++] = rightpart[j++];
            }
        }

        while(i < left){
            nums[k++] = leftpart[i++];
        }

        while(j < right){
            nums[k++] = rightpart[j++];
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,5,3,7,1,4};
        mergeSort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}


