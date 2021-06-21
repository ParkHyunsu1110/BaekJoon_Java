package Q2581;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int sum=0, min=N;
		
		for(int i=M; i<=N; i++) {
			int cnt=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) cnt++;
			}
			if(cnt==2) {
				sum += i;
				if(i<min) min = i;
			}	
		}
		if(sum == 0) sum = -1;
		System.out.println(sum);
		if(sum != -1) System.out.println(min);
	}
}
