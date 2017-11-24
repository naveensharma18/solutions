package com.problem.solution;

import java.util.Scanner;

/*
 * 
2
3
1 2 3
4
-1 -2 -3 -4
 */

public class KadanesMaximumSum {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		for(int i=0;i<times;i++) {
			int cycle = sc.nextInt();
			int arr[] = new int[cycle];
			for(int j=0;j<arr.length;j++) {
				arr[j]=sc.nextInt();
			}
			maxSum(arr);
		}
	}
	
	private static void maxSum(int arr[]){
	    int current = arr[0];
	    int max=arr[0];
	    for(int i=1;i<arr.length;i++) {
	    	current = current+arr[i];
	    	current = Math.max(current, arr[i]);
	    	max=Math.max(max,current);
	    }System.out.println(max);
	}

}
