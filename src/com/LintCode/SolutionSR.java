package com.LintCode;

import java.util.ArrayList;

public class SolutionSR {
	public ArrayList<Integer> searchRange(TreeNode root, int k1, int k2) {
		ArrayList<Integer> results = new ArrayList<>();
        return inOrder(root, k1, k2, results);
    }
	public ArrayList<Integer> inOrder(TreeNode root, int k1, int k2, ArrayList<Integer> results) {
		if(root != null) {
			inOrder(root.left, k1, k2, results);
        	if(root.val >= k1 && root.val <= k2) {
        		results.add(root.val);
        	}
        	inOrder(root.right, k1, k2, results);
        }
		return results;
	}
}
