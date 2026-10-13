package Arrays;
import java.util.ArrayList;

public class IntersectionA {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                arr.add(nums1[i]);
                i++; j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int [] resultArray = new int[arr.size()];
        for(int k=0;k<resultArray.length;k++){
            resultArray[k] = arr.get(k);
        }
        return resultArray;
    }
    public static void main(String[] args) {
        IntersectionA ia = new IntersectionA();
        int [] num1 = {1, 2, 3, 5};
        int [] num2 = {2, 3};
        int [] result = ia.intersectionArray(num1, num2);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] +" ");
        }
    }
}
