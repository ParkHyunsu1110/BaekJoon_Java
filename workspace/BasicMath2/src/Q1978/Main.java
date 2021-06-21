package Q1978;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt=0, primeNum=0;

		for(int i=1; i<=N; i++) {
			int inputNum = sc.nextInt();
			cnt = 0;
			for(int j=1; j<=inputNum; j++) {
				if(inputNum % j == 0) cnt++;
			}
			if(cnt == 2) primeNum++;
		}
		System.out.println(primeNum);
	}
}
