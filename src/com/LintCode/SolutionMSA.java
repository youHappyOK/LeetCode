package com.LintCode;

public class SolutionMSA {
	public int[] mergeSortedArray(int[] A, int[] B) {
		int la = A.length;
		int lb = B.length;
		int[] C = new int[la + lb];
		int pa = 0;
		int pb = 0;
		int pc = 0;
        while(pa <= la - 1 && pb <= lb - 1) {
        	if(A[pa] <= B[pb]) {
        		C[pc] = A[pa];
        		pa++;
        	}else {
        		C[pc] = B[pb];
        		pb++;
        	}
        	pc++;
        }
        if(pa <= la - 1) {
        	for(int j = pa; j <= la - 1; j++) {
        		C[pc] = A[j];
        		pc++;
        	}
        }else if(pb <= lb - 1) {
        	for(int j = pb; j <= lb - 1; j++) {
        		C[pc] = B[j];
        		pc++;
        	}
        }
        return C;
    }
}
