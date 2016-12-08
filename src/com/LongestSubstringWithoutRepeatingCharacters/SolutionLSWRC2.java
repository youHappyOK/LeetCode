package com.LongestSubstringWithoutRepeatingCharacters;

public class SolutionLSWRC2 {
	public int lengthOfLongestSubstring(String s) { 
		int[] pos = new int[256]; //ascii��256���ַ�
		int max = 0;
		int start = 0;	//startΪ��ǰ�Ӵ���ʼλ��
		for(int i = 0; i <=255; i++) {
			pos[i] = -1;
		}
		for(int j = 0; j < s.length(); j++) {
			if(pos[s.charAt(j)] >= start) {	//��һ�γ��ֵ�λ��Ҫ���ڵ��ڵ�ǰ�Ӵ���ʼλ��
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
