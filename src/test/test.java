package test;

import static org.junit.Assert.*;

import java.util.Arrays;

import com.AddTwoNumbers.ListNode;
import com.AddTwoNumbers.SolutionATN;
import com.AddTwoNumbers.SolutionATN2;
import com.LongestSubstringWithoutRepeatingCharacters.SolutionLSWRC;
import com.LongestSubstringWithoutRepeatingCharacters.SolutionLSWRC2;
import com.TowSum.*;

import org.junit.Test;

public class test {

	@Test
	public void testTowSum() {
		SolutionTS s = new SolutionTS();
		int[] nums = {2, 7, 11, 15};
		int[] re = s.twoSum(nums, 9);
		System.out.println(Arrays.toString(re));
	}
	
	@Test
	public void testAddTwoNumbers() {
		SolutionATN s = new SolutionATN();
//		ListNode l1 = new ListNode(2);
//		ListNode l11 = new ListNode(4);
//		ListNode l12 = new ListNode(3);
//		l1.next = l11;
//		l11.next = l12;
//		
//		ListNode l2 = new ListNode(5);
//		ListNode l21 = new ListNode(6);
//		ListNode l22 = new ListNode(4);
//		l2.next = l21;
//		l21.next = l22;
		ListNode l1 = new ListNode(3);
		ListNode l11 = new ListNode(7);
		ListNode l2 = new ListNode(9);
		ListNode l21 = new ListNode(2);
//		ListNode l22 = new ListNode(9);
//		ListNode l23 = new ListNode(9);
//		ListNode l24 = new ListNode(9);
//		ListNode l25 = new ListNode(9);
//		ListNode l26 = new ListNode(9);
//		ListNode l27 = new ListNode(9);
//		ListNode l28 = new ListNode(9);
//		ListNode l29 = new ListNode(9);//³¬¹ýint·¶Î§ÁË£¡£¡£¡
		
		l1.next = l11;
		
		l2.next = l21;
//		l21.next = l22;
//		l22.next = l23;
//		l23.next = l24;
//		l24.next = l25;
//		l25.next = l26;
//		l26.next = l27;
//		l27.next = l28;
//		l28.next = l29; 

		
		ListNode LN = s.addTwoNumbers(l1, l2);
		while(LN != null) {
			System.out.println(LN.val);
			LN = LN.next;
		}
	}
	
	@Test
	public void testLSWRC(){
		SolutionLSWRC2 s = new SolutionLSWRC2();
		String str = "abba";
		
		System.out.println(s.lengthOfLongestSubstring(str));
	}

}
