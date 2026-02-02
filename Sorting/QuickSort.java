package Sorting;
public class QuickSort{
    public static void swap(int [] arr , int begin , int end){
        int temp = arr[begin];
        arr[begin] = arr[end];
        arr[end] = temp;
    }
    
    public static int FindPartation(int[] arr , int begin , int end){
        int pivot = arr[end];
        int i = (begin - 1);
        for(int j=begin;j<end;j++){
            if(arr[j] < pivot){
                i++;
                swap(arr , i , j);
            }
        }
        swap(arr, i+1, end);
        return i+1;
    }

    public static void QuickArrange(int[] arr , int begin , int end){
        if(begin < end){
            int partition = FindPartation(arr, begin, end);

            QuickArrange(arr, begin, partition-1);

            QuickArrange(arr, partition+1, end);
        }
    }

    public static void QuickSort(int [] arr){
        QuickArrange(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {
        int nums[] = {4,9,2,5,7,1,6,8,3};
        QuickSort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

}

