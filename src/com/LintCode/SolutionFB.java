package com.LintCode;

import java.util.ArrayList;
import java.util.List;

public class SolutionFB {
	public ArrayList<String> fizzBuzz(int n) {
		ArrayList<String> results = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			if(i % 15 == 0) {
				results.add("fizz buzz");
			}
			else{
				if(i % 3 == 0) {
					results.add("fizz");
					continue;
				}
				if(i % 5 == 0) {
					results.add("buzz");
					continue;
				}
				results.add(String.valueOf(i));
			}		
		}
		return results;
	
    }
}
