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
public class Problem2 {
	/**
	 * 
	 * @return
	 * @throws FileNotFoundException
	 */
	static Scanner newInput() throws FileNotFoundException {
			return new Scanner(new File("E:\\Java Workspaces\\workspace\\Edx Competitive Programming Course\\src\\com\\competitive\\week1\\aplusbb.in"));
	}
	/**
	 * 
	 * @return
	 * @throws FileNotFoundException
	 */
	static PrintWriter newOutput() throws FileNotFoundException {
		return new PrintWriter("E:\\Java Workspaces\\workspace\\Edx Competitive Programming Course\\src\\com\\competitive\\week1\\aplusbb.out");
		
	}
	/**
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String args[]) throws FileNotFoundException {
		try (Scanner sc = newInput(); PrintWriter out = newOutput();) {
			Long num1 = sc.nextLong();
			Long num2 = sc.nextLong();
			out.println(num1 + (num2*num2));
		}
	}
}
