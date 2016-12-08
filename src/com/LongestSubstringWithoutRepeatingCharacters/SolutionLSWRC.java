package com.LongestSubstringWithoutRepeatingCharacters;

public class SolutionLSWRC {
	public int lengthOfLongestSubstring(String s) { 
		int[] pos = new int[256]; //ascii有256个字符
		int max = 0;
		int prev = -1;	//prev为当前子串的开始位置-1
		for(int i = 0; i <=255; i++) {
			pos[i] = -1;
		}
		for(int j = 0; j < s.length(); j++) {
			if(pos[s.charAt(j)] > prev) {	//该字符存在过，且上一次出现的位置大于prev
				prev = pos[s.charAt(j)];
			}
			if(j - prev > max) {
				max = j - prev;
			}
			pos[s.charAt(j)] = j;
		}
		
		return max;
	}
}
