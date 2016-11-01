package com.competitive.week1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * s
 * @author Manan
 *
 */
public class Problem1 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]){
		try {
			Scanner sc = new Scanner(new File("E:\\Java Workspaces\\workspace\\Edx Competitive Programming Course\\src\\com\\competitive\\week1\\aplusb.in"));
			PrintWriter out = new PrintWriter("E:\\Java Workspaces\\workspace\\Edx Competitive Programming Course\\src\\com\\competitive\\week1\\aplusb.out");
			int res = sc.nextInt() + sc.nextInt();
			out.println(res);
			sc.close();
			out.close();
			System.out.println(res);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

//Another Good Solution


/*package x.y.z;

import java.io.*;
import java.util.*;

public class Main {
    static Scanner newInput() throws IOException {
        if (System.getProperty("JUDGE") != null) {
            return new Scanner(new File("aplusb.in"));
        } else {
            return new Scanner(System.in);
        }
    }
    static PrintWriter newOutput() throws IOException {
        if (System.getProperty("JUDGE") != null) {
            return new PrintWriter("aplusb.out");
        } else {
            return new PrintWriter(System.out);
        }
    }

    public static void main(String[] args) throws IOException {
        try (Scanner in = newInput(); PrintWriter out = newOutput()) {
            out.println(in.nextInt() + in.nextInt());
        }
    }
}*/