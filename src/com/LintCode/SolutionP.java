package com.LintCode;

import java.util.ArrayList;

/***
 * http://blog.csdn.net/randyjiawenjie/article/details/6313729
 * @author Jin
 *
 */
public class SolutionP {
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
		ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
		if(nums == null)
			return results;
		perm(results, nums, 0, nums.size());
		return results;
    }
	public void perm(ArrayList<ArrayList<Integer>> results, ArrayList<Integer> nums, int cycleStart, int len) {
		if(cycleStart == len - 1) {
			ArrayList<Integer> result = new ArrayList<Integer>();
			for(int i = 0; i < len; i++) {
				result.add(nums.get(i));
			}
			results.add(result);
		}
		else {
			for(int j = cycleStart; j < len; j++) {
				swap(nums, cycleStart, j);
				perm(results, nums, cycleStart + 1, len);
				swap(nums, cycleStart, j);
			}
		}
	} 
	public void swap(ArrayList<Integer> nums, int m, int n) {
		int temp = nums.get(m);
		nums.set(m, nums.get(n)); 
		nums.set(n, temp);
	}
}
