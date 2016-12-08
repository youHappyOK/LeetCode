package com.AddTwoNumbers;

import java.util.ArrayList;
import java.util.List;

public class SolutionATN {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode p3 = new ListNode(0);
		ListNode p1 = l1, p2 = l2, start = p3;
		int flag = 0;//进位
		int realSum = 0;
		while(p1 != null || p2 != null) {
			int sum = 0;
			if(p1 == null && p2 != null) {
				sum = p2.val + flag;
				flag = 0; //加完之后flag重置为0
				p2 = p2.next;
			}
			if(p2 == null && p1 != null) {
				sum = p1.val + flag;
				flag = 0; //加完之后flag重置为0
				p1 = p1.next;	
			}
			if(p1 != null && p2 != null) {
				sum = p1.val + p2.val + flag;
				flag = 0; //加完之后flag重置为0
				p1 = p1.next;
				p2 = p2.next;
			}
			if(sum / 10 >= 1) {
				flag = 1;
			}
			ListNode ln = new ListNode(sum % 10);
			p3.next = ln;
			p3 = ln;
		}
		if(flag == 1) {
			ListNode last = new ListNode(1);
			p3.next = last;
		}
		return start.next;
	}
}
