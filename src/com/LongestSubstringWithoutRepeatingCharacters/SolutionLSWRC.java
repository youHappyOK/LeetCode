package com.LongestSubstringWithoutRepeatingCharacters;

public class SolutionLSWRC {
	public int lengthOfLongestSubstring(String s) { 
		int[] pos = new int[256]; //ascii��256���ַ�
		int max = 0;
		int prev = -1;	//prevΪ��ǰ�Ӵ��Ŀ�ʼλ��-1
		for(int i = 0; i <=255; i++) {
			pos[i] = -1;
		}
		for(int j = 0; j < s.length(); j++) {
			if(pos[s.charAt(j)] > prev) {	//���ַ����ڹ�������һ�γ��ֵ�λ�ô���prev
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
