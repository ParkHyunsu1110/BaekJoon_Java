package Q8958;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		String ox;
		for(int i=0; i<testCase; i++) {
			int count=0, sum=0;
			ox = sc.next();
			for(int j=0; j<ox.length(); j++) {
				if(ox.charAt(j) == 'O') {
					count++;
					sum += count;
				}
				else count = 0;
			}
			System.out.println(sum);
		}
	}
}
