package Arrays;
import java.util.ArrayList;

public class IsSorted {
    public static boolean isSorted(ArrayList<Integer> nums){
        int n = nums.size();
        int count = 0;
        for(int i=1;i<n;i++){
            if(nums.get(i-1) > nums.get(i)){
                count++;
            }
        }
        if(nums.get(n-1) > nums.get(0)){
            count++;
        }
        if(count > 1){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(9);
        nums.add(6);
        nums.add(8);
        nums.add(5);
        nums.add(4);
        nums.add(0);
        System.out.print(isSorted(nums));
    }
}



