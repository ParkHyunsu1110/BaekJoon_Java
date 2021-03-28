package Q2292;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		int range = 2;
		if(N == 1) System.out.println(1);
		else {
			while(range <= N) {
				range = range + (6*count);
				count++;
			}
			System.out.println(count);
		}
	}
}