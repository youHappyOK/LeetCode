package com.LintCode;

import java.util.ArrayList;

public class SolutionS {
	public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
		ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
		sort(nums);
		int max = 1 << nums.length;
        for(int i = 0; i < max; i++) {
        	int index = 0;
        	ArrayList<Integer> result = new ArrayList<Integer>(); 
        	int j = i;
        	while(j > 0) {
        		if((j & 1) == 1) {
        			result.add(nums[index]);
        		}
        		index++;
        		j = j >> 1;
        	}
        	results.add(result);
        }
        return results;
	}
	public void sort(int[] nums) {
		int len = nums.length;
		for(int i = 0; i < len; i++) {
			for(int j = len - 1; j > i; j--) {
				if(nums[j-1] > nums[j]) {
					int temp = nums[j-1];
					nums[j-1] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}
}
