package Q2675;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();	//testCase
		for(int i=0; i<T; i++) {
			int R = sc.nextInt(); //repeat
			String S = sc.next();
			for(int j=0; j<S.length(); j++) {
				for(int k=0; k<R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
	}
}