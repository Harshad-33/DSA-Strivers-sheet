package Arrays;

public class RearrangeArrEle {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int [] result = new int[n];
        int pos = 0;
        int neg = 1;
        for(int i=0;i<n;i++){
            if(nums[i] > 0){
                result[pos] = nums[i];
                pos += 2;
            }else{
                result[neg] = nums[i];
                neg += 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums = {3,1,-2,-5,2,-4};
        int [] result = rearrangeArray(nums);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}


