package com.LintCode;

public class SolutionRS {
	public void rotateString(char[] str, int offset) {
        if(str != null && str.length >= 1) {
    		offset %= str.length;
            int length = str.length;
            char[] temp = new char[offset];
            for(int i = length - offset,  j = 0; i <= length - 1 && j < offset; i++, j++) {
            	temp[j] = str[i];
            }
            for(int k = length - 1 - offset; k >= 0; k--) {
            	str[k + offset] = str[k];
            }
            for(int m = 0; m < offset; m++) {
            	str[m] = temp[m];
            }
        }
    }
}
