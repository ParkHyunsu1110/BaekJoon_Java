package Q1110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N<0 || N>99) return;
		int num = N;
		boolean times = true;
		int i=0;
		while(times) {
			int x = num/10, y = num%10;
			int sum = x + y;
			num = y*10 + sum%10;
			if(N == num) times = false;
			i++;
		}
		System.out.println(i);
	}

}
