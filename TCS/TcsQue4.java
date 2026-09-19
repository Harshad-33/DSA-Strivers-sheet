package TCS;

import java.util.Scanner;

/*
Amazon is preparing for its annual shopping festival and wants to identify its top-performing  products.
Given the sales count of different products, find the Kth best-selling product.
The Kth best - selling product is the product whose sales rank is exactly K when all product are sorted in descending order of sales.
To optimize memory and performance for large datasets, the solution must use a min heap for size K.

*/

public class TcsQue4{
	public static int KthBestProduct(int[] nums, int k){
		PriorityQueu<Integer> minHeap = new PriorityQueue<>();
		for(int i=0;i<nums.length;i++){
			minHeap.offer(nums[i]);
			if(minHeap.size() > k){
				minHeap.poll(); // remove smallest
			}
		}
		return minHeap.peek();
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num of products : ");
		int n = sc.nextInt();
		System.out.print("Enter K : ");
		int k = sc.nextInt();

		int [] nums = new int[n];
		System.out.print("Enter sales Count: ");

		for(int i=0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		
		System.out.println(KthBestProduct(nums,k));
		
		sc.close();
	}
}
