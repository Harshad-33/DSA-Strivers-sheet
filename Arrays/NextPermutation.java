package Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int piv = -1;
        int n = nums.length;
        for(int i = n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                piv = i;
                break;
            }
        }
        if(piv != -1){
            for(int i=n-1;i>piv;i--){
                if(nums[i] > nums[piv]){
                    int temp = nums[i];
                    nums[i] = nums[piv];
                    nums[piv] = temp;
                    break;
                }
            }
        }
        reverseArray(nums,piv,n);
    }
    public static void reverseArray(int[] nums , int piv , int n){
        int i = piv+1;
        int j = n-1;
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int [] nums = {3,2,1};
        nextPermutation(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}

