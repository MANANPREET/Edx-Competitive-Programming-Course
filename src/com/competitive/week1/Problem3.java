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
		return new Scanner(new File("prepare.in"));
	}
	
	static PrintWriter newOutput() throws FileNotFoundException {
		return new PrintWriter("prepare.out");
	}
	public static void main(String args[]) throws FileNotFoundException{
		try(Scanner sc = newInput(); PrintWriter out = newOutput();){
			
		}
	}
}
