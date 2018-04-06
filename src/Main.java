import java.util.Scanner;

import parades.MSCA;

public class Main {
	
	private static char[] x;
	private static char[] y;
	static MSCA seq;

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String c = ".";
		String a = c + in.nextLine();
		String b = c + in.nextLine();
		
		x = a.toCharArray();
		y = b.toCharArray();
		seq = new MSCA();
		
		String result = seq.lcs(x, y);
		System.out.println(result.length());
		if(result.length() > 0) {
		String s = String.valueOf(result);
		System.out.println(s);
		}
		in.close();
	}
		
		
}


