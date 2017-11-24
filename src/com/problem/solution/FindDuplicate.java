package com.problem.solution;

import java.util.Scanner;

public class FindDuplicate {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		for(int i=0;i<times;i++) {
			int cycle = sc.nextInt();
			int arr[] = new int[cycle-1];
			for(int j=0;j<arr.length;j++) {
				arr[j]=sc.nextInt();
			}
			findMissing(arr);
		}
	}
	
	private static void findMissing(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			if(!((arr[i]+1)==arr[i+1])) {
				System.out.println(arr[i]+1);
			}
		}
	}
}
