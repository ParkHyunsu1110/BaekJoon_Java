package Q2869;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), V = sc.nextInt();
		int day=(V - B)/(A - B);
		
		if((V - B)%(A - B) != 0) day++; 
		System.out.println(day);
	}
}
