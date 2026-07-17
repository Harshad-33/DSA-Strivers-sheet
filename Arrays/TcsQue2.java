/*
Que:- Given a sorted array and a key, perform binary search, 1) If the key is found , print the key, otherwise print the element whose value is closest(minimum absolute difference) to the key , if two element are equally close , print the smaller element.
*/

public class TcsQue2{
	public static int KeyPrint(int [] nums , int key){
		int low = 0;
		int high = nums.length-1;
		
		while(low<=high){
			int mid = (low+high)/2;
			if(nums[mid] == key){
				return key;
			}
			else if(nums[mid] > key){
				high = mid-1;
			}else if(nums[mid] < key){
				low = mid+1;
			}
		}
		
		// If key is smaller than all elements
        	if (high < 0){
            		return nums[0];
		}
		
        	// If key is greater than all elements
        	if (low >= nums.length){
            		return nums[nums.length - 1];
		}
		
		int difflow =  Math.abs(nums[low]-key);
		int diffhigh = Math.abs(nums[high]-key);

		if(difflow < diffhigh){
			return nums[low];
		}
		if(diffhigh < difflow){
			return nums[high];
		}
		
		return Math.min(nums[low],nums[high]);
	}
	public static void main(String args[]){
		int [] nums = {1,5,6,9,10,11,16,18,20};
		int key = 2;
		System.out.println(KeyPrint(nums , key));
	}
}