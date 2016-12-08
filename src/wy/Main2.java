package wy;

import java.util.Scanner;



public class Main2 {
	public static class Pair{
		int x;
		int y;
	}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
        	int n = s.nextInt();
        	Pair[] arr = new Pair[n];
            for(int i=0; i<n; i++){
            	int t = s.nextInt();
            	Pair p = new Pair();
            	p.x = fun(t);
            	p.y = t;
            	arr[i] = p;
            }
            sort(arr);
            for(int i=arr.length-1; i>=0; i--){
            	System.out.print(arr[i].y);
            }
            System.out.println();
        }
    }
    
    public static int fun(int x){
    	while(x/10 != 0){
    		x /= 10;
    	}
    	return x;
    }

    public static void sort(Pair[] arr){
    	int length = arr.length;
    	for(int i=0; i<=length-2; i++){
			for(int j=0; j<=length-i-2; j++){
				if(arr[j].x > arr[j+1].x){
					Pair temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
    }
}
