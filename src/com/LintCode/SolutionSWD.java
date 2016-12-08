package com.LintCode;

import java.util.ArrayList;
import java.util.Collections;

public class SolutionSWD {
	public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> S) {
		ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
		Collections.sort(S);
		int max = 1 << S.size();
        for(int i = 0; i < max; i++) {
        	int index = 0;
        	ArrayList<Integer> result = new ArrayList<Integer>(); 
        	int j = i;
        	while(j > 0) {
        		if((j & 1) == 1) {
        			result.add(S.get(index));
        		}
        		index++;
        		j = j >> 1;
        	}
        	int k;
			for(k= 0; k < results.size(); k++) {
				if(arrayListEquals(results.get(k), result)) {
					break;
				}
			}
        	if(k == results.size())
        		results.add(result);
        }
        return results;
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
