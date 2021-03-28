package Q1712;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();	//고정비용
		int B = sc.nextInt();	//가변비용
		int C = sc.nextInt();	//판매비용

		if(C <= B) System.out.println("-1");
		else System.out.println(A/(C-B)+1);
	}	
}
