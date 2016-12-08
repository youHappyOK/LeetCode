package com.AddTwoNumbers;

import java.util.ArrayList;
import java.util.List;

public class SolutionATN2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int x = 0,length1 = 0; 
		int y = 0,length2 = 0; 
		ListNode temp1 = l1;
		while(temp1 != null) {
			x += temp1.val * Math.pow(10,length1);
			temp1 = temp1.next;
			length1++;
		}
		ListNode temp2 = l2;
		while(temp2 != null) {
			y += temp2.val * Math.pow(10,length2);
			temp2 = temp2.next;
			length2++;
		}
		int sum = x + y;	//求和
		//System.out.println(sum);
//		if(sum == 0) {		//处理和为0的问题
//			return new ListNode(0);
//		}
		List<ListNode> LNS = new ArrayList<ListNode>();
		while(sum / 10 != 0) {
			ListNode ln = new ListNode(sum % 10); 
			LNS.add(ln);
			sum = sum / 10;
		}
		ListNode ln = new ListNode(sum); 
		LNS.add(ln);
		for(int i = 0; i <= LNS.size() - 1; i++) {
			if(i <= LNS.size() - 2){
				LNS.get(i).next = LNS.get(i+1);
			}else{
				LNS.get(i).next = null;
			}
		}
		return LNS.get(0);
	}
}
