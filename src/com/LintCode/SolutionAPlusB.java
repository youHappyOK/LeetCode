package com.LintCode;

public class SolutionAPlusB {
	public int aplusb(int a, int b) {
		while(b != 0) {
			int a1 = a ^ b;
			int b1 = (a & b) << 1;
			a = a1;
			b = b1;
		}
		return a;
    }
}
