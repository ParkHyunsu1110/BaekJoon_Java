package Q2908;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String A = sc.next(), B = sc.next();
		String arrA[] = A.split("");
		String arrB[] = B.split("");
		String newA="";
		String newB="";
		for(int i=0; i<3; i++) {
			newA+=arrA[A.length()-(i+1)];
			newB+=arrB[B.length()-(i+1)];
		}
		int resultA = Integer.parseInt(newA);
		int resultB = Integer.parseInt(newB);
		if(resultA > resultB) System.out.println(resultA);
		else System.out.println(resultB);	
	}
}
