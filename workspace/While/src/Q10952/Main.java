package Q10952;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		boolean cycle = true;
		while(cycle) {
			sum = 0;
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A == 0 && B == 0) {
				cycle = false;
				continue;
			}
			else {
				sum = A+B;
				System.out.println(sum);
			}
			
		}
	}

}
