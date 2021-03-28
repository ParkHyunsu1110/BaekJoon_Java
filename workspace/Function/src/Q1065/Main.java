package Q1065;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(arithmeticSequence(sc.nextInt()));
		sc.close();
	}
	public static int arithmeticSequence(int num) {
		int count=0;
		if(num<100) count = num;
		else {
			count = 99;
			if(num == 1000) num = 999;
			for(int i=100; i<=num; i++) {
				int h = i/100;
				int t = (i/10)%10;
				int o = i%10;
				
				if((h - t) == (t - o)) count++;
			}
		}
		return count;
	}
}
