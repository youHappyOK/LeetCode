package com.LintCode;

public class SolutionDC {
	public int digitCounts(int k, int n) {
		int count = 0;
        for(int i = 0; i <= n; i++) {
        	int j = i;
        	while(true) {
        		if(j % 10 == k) {
        			count++;
        		}
        		j = j / 10;
        		if(j == 0) 
        			break;
        	}
        }
        return count;
    }
}
