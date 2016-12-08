package com.LongestSubstringWithoutRepeatingCharacters;

public class SolutionLSWRC2 {
	public int lengthOfLongestSubstring(String s) { 
		int[] pos = new int[256]; //ascii有256个字符
		int max = 0;
		int start = 0;	//start为当前子串起始位置
		for(int i = 0; i <=255; i++) {
			pos[i] = -1;
		}
		for(int j = 0; j < s.length(); j++) {
			if(pos[s.charAt(j)] >= start) {	//上一次出现的位置要大于等于当前子串起始位置
				start = pos[s.charAt(j)] + 1;
			}
			if(j - start + 1 > max) {
				max = j - start + 1;
			}
			pos[s.charAt(j)] = j;
		}
		
		return max;
	}
}
