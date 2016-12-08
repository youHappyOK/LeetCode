package com.LintCode;

import java.util.Stack;


public class SoultionMinStack {
	public Stack<Integer> stack;
	public Stack<Integer> minStack;
	
	public SoultionMinStack() {
		this.stack = new Stack<Integer>();
		this.minStack = new Stack<Integer>();
    }

    public void push(int number) {
    	stack.push(number);
    	if(minStack.isEmpty() || number <= minStack.peek()) { //Ò»¶¨ÊÇ<=
    		minStack.push(number);
    	}
    }

    public int pop() {
		int result = stack.pop();
		if(result == minStack.peek()) {
    		minStack.pop();
		}
    	return result;
    }

    public int min() {
    	return minStack.peek();
    }
}
