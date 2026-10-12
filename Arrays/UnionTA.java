package Arrays;
import java.util.ArrayList;

public class UnionTA {
    public int[] unionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != nums1[i]) {
                    result.add(nums1[i]);
                }
                i++;
            } else if (nums2[j] < nums1[i]) {
                if (result.isEmpty() || result.get(result.size() - 1) != nums2[j]) {
                    result.add(nums2[j]);
                }
                j++;
            } else {
                if (result.isEmpty() || result.get(result.size() - 1) != nums1[i]) {
                    result.add(nums1[i]);
                }
                i++;
                j++;
            }
        }
        while (i < nums1.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != nums1[i]) {
                result.add(nums1[i]);
            }
            i++;
        }
        while (j < nums2.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != nums2[j]) {
                result.add(nums2[j]);
            }
            j++;
        }
        int[] resultArray = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            resultArray[k] = result.get(k);
        }

        return resultArray;
    }
    public static void main(String[] args) {
        UnionTA ut = new UnionTA();
        int[] num1 = {1, 2, 2, 3, 5};
        int [] num2 = {2, 3, 4, 5, 6};
        int [] result = ut.unionArray(num1, num2);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}

