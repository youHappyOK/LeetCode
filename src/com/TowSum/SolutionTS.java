package com.TowSum;

public class SolutionTS {
	public int[] twoSum(int[] nums, int target) {
		int[] r = new int[2];
        int l = nums.length;
        for(int i = 0; i < l; i++){
        	for(int j=i+1; j<l; j++){
	        	if(nums[i] + nums[j] == target) {
	        		r[0] = i;
	        		r[1] = j;
	        		return r;
	        	}
        	}
        }
        return r;
    }
}