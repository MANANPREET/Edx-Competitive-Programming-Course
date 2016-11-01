package com.competitive.week1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * 
 * @author Manan
 *
 */
public class Problem3 {

	static Scanner newInput() throws FileNotFoundException {
		return new Scanner(new File("E:\\Java Workspaces\\workspace\\Edx Competitive Programming Course\\src\\com\\competitive\\week1\\prepare.in"));
	}
	
	static PrintWriter newOutput() throws FileNotFoundException {
		return new PrintWriter("E:\\Java Workspaces\\workspace\\Edx Competitive Programming Course\\src\\com\\competitive\\week1\\prepare.out");
	}
	
	private static int calculateMinDiff(int[] diff) {
		int min = diff[0];
		int pos = 0;
		for(int i = 1; i < diff.length; i++) {
			if(min > diff[i]) {
				min = diff[i];
				pos = i;
			}
		}
		return pos;
	}
	
	public static void main(String args[]) throws FileNotFoundException{
		try(Scanner sc = newInput(); PrintWriter out = newOutput();){
			int count = sc.nextInt();
			int[] arrayA = new int[count]; 
			int[] arrayB = new int[count];
			int result = 0; 
			int maxA = 0;
			int maxB = 0;
			int[] diff = new int[count]; 
			int minDiffPos;
			for(int i = 0; i < count; i++) {
				arrayA[i] = sc.nextInt();
			}
			for(int i = 0; i < count; i++) {
				arrayB[i] = sc.nextInt();
			}
			
			for(int i = 0; i< count; i++) {
				if(arrayA[i] >= arrayB[i]) {
					result+= arrayA[i];
					maxA+=1;
					diff[i] = Math.abs(arrayA[i]-arrayB[i]);
				}
				else {
					result+= arrayB[i];
					maxB+=1;
					diff[i] = Math.abs(arrayA[i]-arrayB[i]);
				}
			}
			
			minDiffPos = calculateMinDiff(diff);
			if(maxA == count){
				result = result - arrayA[minDiffPos] + arrayB[minDiffPos];
			}
			else if(maxB == count){
				result = result - arrayB[minDiffPos] + arrayA[minDiffPos];
			}
			out.println(result);
			System.out.println(result);
		}
	}
}
