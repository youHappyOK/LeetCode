package com.LintCode;

import java.util.ArrayList;

public class SolutionPU {
	public ArrayList<ArrayList<Integer>> permuteUnique(ArrayList<Integer> nums) {
		ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
		if(nums == null)
			return results;
		permU(results, nums, 0, nums.size());
		return results;
    }
	public void permU(ArrayList<ArrayList<Integer>> results, ArrayList<Integer> nums, int cycleStart, int len) {
		if(cycleStart == len - 1) {
			ArrayList<Integer> result = new ArrayList<Integer>();
			for(int i = 0; i < len; i++) {
				result.add(nums.get(i));
			}
			int count = 0;
			for(int j = 0; j < results.size(); j++) {
				if(!arrayListEquals(results.get(j), result)) {
					count++;
				}
			}
			if(count == results.size())
				results.add(result);
		}
		else {
			for(int j = cycleStart; j < len; j++) {
				swap(nums, cycleStart, j);
				permU(results, nums, cycleStart + 1, len);
				swap(nums, cycleStart, j);
			}
		}
	} 
	public void swap(ArrayList<Integer> nums, int m, int n) {
		int temp = nums.get(m);
		nums.set(m, nums.get(n)); 
		nums.set(n, temp);
	}
	public boolean arrayListEquals(ArrayList<Integer> nums1, ArrayList<Integer> nums2){
		if(nums1.size() != nums2.size())
			return false;
		for(int i = 0; i < nums1.size(); i++) {
			if(nums1.get(i) != nums2.get(i))
				return false;
		}
		return true;
	}
}
