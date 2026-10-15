package Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement1{
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }
        int maxcount = 0;
        int majority = 0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > maxcount) {
                maxcount = entry.getValue();
                majority = entry.getKey();
            }
        }
        return  majority;
    }
    public static void main(String[] args) {
        MajorityElement1 me = new MajorityElement1();
        int [] nums = {7,0,0,1,7,7,2,7,7};
        System.out.print(me.majorityElement(nums));
    }
}
