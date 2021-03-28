package Q1011;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int x = sc.nextInt(); 
			int y = sc.nextInt();

			int l = y - x;
			int max = (int)Math.sqrt(l);
			
			if(max == Math.sqrt(l)) System.out.println(max * 2 - 1);
			else if(l <= max * max + max) System.out.println(max*2);
			else System.out.println(max*2+1);
		}
	}
}
