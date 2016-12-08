package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import com.LintCode.SolutionAPlusB;
import com.LintCode.SolutionBS;
import com.LintCode.SolutionDC;
import com.LintCode.SolutionFB;
import com.LintCode.SolutionKLE;
import com.LintCode.SolutionKPN;
import com.LintCode.SolutionMSA;
import com.LintCode.SolutionP;
import com.LintCode.SolutionPU;
import com.LintCode.SolutionRS;
import com.LintCode.SolutionS;
import com.LintCode.SolutionSAD;
import com.LintCode.SolutionSM;
import com.LintCode.SolutionSR;
import com.LintCode.SolutionSS;
import com.LintCode.SolutionSWD;
import com.LintCode.SolutionTZ;
import com.LintCode.TreeNode;

public class testLintCode {

	@Test
	public void testAplusb() {
		SolutionAPlusB s = new SolutionAPlusB();
		System.out.println(s.aplusb(4, 5));
	}
	@Test
	public void testTZ(){
		SolutionTZ s = new SolutionTZ();
		System.out.println(s.trailingZeros(65461654));
	}
	@Test
	public void testDC(){
		SolutionDC s = new SolutionDC();
		System.out.println(s.digitCounts(1, 12));
	}
	@Test
	public void testKPN(){
		SolutionKPN s = new SolutionKPN();
		System.out.println(s.kthPrimeNumber(11));
	}
	@Test
	public void testKLE(){
		int[] nums = {7,9,5,8,7,6,4,9,78,2};
		SolutionKLE s = new SolutionKLE();
		System.out.println(s.kthLargestElement(10, nums));
	}
	@Test
	public void testMSA(){
//		int[] A = {1,2,3,4};
//		int[] B = {2,4,5,6};
		int[] A = {1};
		int[] B = {1};
		SolutionMSA s = new SolutionMSA();
		System.out.println(Arrays.toString(s.mergeSortedArray(A, B)));
	}
	@Test 
	public void testSAD(){
		SolutionSAD s = new SolutionSAD();
		String data = "{3,9,20,#,#,15,7}";
		System.out.println(s.serialize(s.deserialize(data)));
	}
	@Test
	public void testRS(){
		char[] str = {'c','p','p','j','a','v','a','p','y',};
		SolutionRS s = new SolutionRS();
		s.rotateString(str, 25);
		System.out.println(Arrays.toString(str));
	}
	@Test
	public void testFB(){
		SolutionFB s = new SolutionFB();
		System.out.println(s.fizzBuzz(15));
	}
	@Test
	public void testSR(){
		SolutionSAD sad = new SolutionSAD();
		String data = "{2,1,#}";
		TreeNode root = sad.deserialize(data);
		SolutionSR sr = new SolutionSR();
		System.out.println(sr.searchRange(root, 0, 4));
	}
	@Test 
	public void testSS(){
		SolutionSS s = new SolutionSS();
//		System.out.println(s);
		System.out.println(s.strStr("", ""));
	}
	@Test
	public void testBS(){
		SolutionBS s = new SolutionBS();
		int nums[] = {4,5,9,9,12,13,14,15,15,18};
		System.out.println(s.binarySearch(nums, 10));
	}
	@Test 
	public void testP(){
		SolutionP s = new SolutionP();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(2);

		System.out.println(s.permute(arr));
	}
	@Test 
	public void testPU(){
		SolutionPU s = new SolutionPU();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(2);
//		arr2.add(1);
//		arr2.add(2);
//		arr2.add(3);
//		System.out.println(s.arrayListEquals(arr, arr2));
		System.out.println(s.permuteUnique(arr));
	}
	@Test
	public void testS(){
		SolutionS s = new SolutionS();
		int[] nums = {1,3,2,5};
		System.out.println(s.subsets(nums));
	}
	@Test
	public void testSWD(){
		SolutionSWD s = new SolutionSWD();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(2);
		System.out.println(s.subsetsWithDup(arr));
	}
	@Test
	public void testSM(){
		SolutionSM s = new SolutionSM();
		int[][] matrix = {{1,3,5,9},{10,11,16,20},{23,30,34,50},{51,100}};
		System.out.println(s.searchMatrix(matrix, 30));
	}
}
