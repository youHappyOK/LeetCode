package com.LintCode;

import java.util.Arrays;

public class SolutionKLE {
	/***
	 * 快速排序实现
	 * @param k
	 * @param nums
	 * @return
	 */
	public int kthLargestElement(int k, int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums[k - 1];
    }
	
	public void quickSort(int[] nums, int left, int right) {
		if(right > left){ //递归结束条件
			int p = partition(nums, left, right);
			quickSort(nums, left, p - 1);
			quickSort(nums, p + 1, right);
		}
	}
	
	public int partition(int[] nums, int left, int right) {
		int key = nums[left];
		while(right > left) {
			while(right > left && nums[right] <= key) {
				right--;
			}
			nums[left] = nums[right]; 
			while(right > left && nums[left] >= key) {
				left++;
			}
			nums[right] = nums[left]; 
		}
		nums[right] = key;
		return right;
	}
}
