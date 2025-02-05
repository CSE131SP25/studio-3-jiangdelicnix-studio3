package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Choose an upper limit:");
		int n = in.nextInt();
		int k = 2;
		
		boolean numbers [] = new boolean [n-1];
		
		for (int i = 0; i < n; i++) {
			int multiple = 0;
			while (multiple < n) {
				int multiple1 = (i+2)*k ;
				k++;
				numbers[multiple1] = true;
			}
			if (numbers[i] == false) {
				System.out.println(i + 2);
			}
		}

	}

}
