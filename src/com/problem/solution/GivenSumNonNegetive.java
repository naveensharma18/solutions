package com.problem.solution;

public class GivenSumNonNegetive {

	public static void main(String args[]) {
		int arr[]= {15, 2, 4, 8, 9, 5, 10, 23};
		int x=23;
		int sum=0;
		int startIndex=0;
		
		for(int i=0;i<arr.length;i++) {
			while(sum>x && startIndex<i-1) {
				sum=sum-arr[startIndex];
				startIndex++;
			}
			if(sum==x) {
				i=i-1;
				System.out.println(startIndex+"    "+i);
				return;
			}
			if(i<arr.length) {
				sum=sum+arr[i];
			}
		}

	}
	
	
}
