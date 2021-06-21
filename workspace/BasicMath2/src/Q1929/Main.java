package Q1929;

import java.util.Scanner;

public class Main {
	public static boolean[] isPrime;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt(), N = sc.nextInt();
		
		isPrime = new boolean[N+1];
		getPrime();
		
		for(int i=M; i<=N; i++)
			if(!isPrime[i]) System.out.println(i);
	}
	
	public static void getPrime() {
		isPrime[0] = isPrime[1] = true;
		
		for(int i = 2; i < Math.sqrt(isPrime.length); i++) {
			if(isPrime[i]) continue;
			for(int j = i*i; j<isPrime.length; j+=i) {
				isPrime[j] = true;
			}
		}
	}
}
