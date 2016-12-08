package com.LintCode;

public class SolutionSM {
	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix == null || matrix.length == 0) {
			return false;
		}
        int len1 = matrix.length;
        int low1 = 0, high1 = len1 - 1;
        int mid1 = (low1 + high1) / 2;
        while(high1 >= low1) {
            mid1 = (low1 + high1) / 2;
            int lenMid = matrix[mid1].length;
            if(target > matrix[mid1][0]) {
            	if(target > matrix[mid1][lenMid - 1]) {
            		low1 = mid1 + 1;
            	}
            	else {
            		break;
            	}
            }
            if(target < matrix[mid1][0]){
            	high1 = mid1 - 1;
            }
            if(target == matrix[mid1][0]) {
            	return true;
            }
        }
        int len2 = matrix[mid1].length;
        int low2 = 0, high2 = len2 - 1;
        if(matrix[mid1] == null || matrix[mid1].length == 0) {
			return false;
		}
        while(high2 >= low2) {
            int mid2 = (low2 + high2) / 2;
            if(target > matrix[mid1][mid2]) {
            	low2 = mid2 + 1;
            }
            if(target < matrix[mid1][mid2]){
            	high2 = mid2 - 1;
            }
            if(target == matrix[mid1][mid2]) {
            	return true;
            }
        }
        return false;
    }
}
