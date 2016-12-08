package com.LintCode;

public class SolutionBS {
	
//    public int binarySearch(int[] nums, int target) {
//        int length = nums.length;
//        int mid = (0 + length) / 2;
//        int tempMid = mid;
//        BS(nums, 0, length - 1, target);
//    }
//    
//    public int BS(int nums[], int p1, int p2, int target) {
//        int mid = (p1 + p2) / 2;
//        int tempMid = mid;
//        if(nums[tempMid] == target) {
//        	--tempMid;
//	    	while(nums[tempMid] == target) {
//	    		--tempMid;
//	    	}
//	    	return tempMid++;
//        }
//    	if(nums[tempMid] < target) {  
//    		return BS(nums, p1, mid - 1, target);
//    	}
//    	if(nums[tempMid] > target){
//    		return BS(nums, mid + 1, p2, target);
//        }
//		return tempMid;
//    }
	public int binarySearch(int[] nums, int target) {
		int p1 = 0;
		int p2 = nums.length; 
		int mid = (p1 + p2) / 2;
		while(nums[mid] != target && p2 >= p1) {
			if(nums[mid] < target) {
				p1 = mid + 1;
				mid = (p1 + p2) / 2;
			} 
			if(nums[mid] > target) {
				p2 = mid - 1;
				mid = (p1 + p2) / 2;
			}
		}
		if(nums[mid] == target) {
			if(mid >= 1) {
				--mid;
				while(nums[mid] == target) {
					--mid;
				}
				return ++mid;
			}
			else 
				return mid;
		}
		else {
			return -1;
		}
	}
}
