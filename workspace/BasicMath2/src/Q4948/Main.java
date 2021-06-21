package Q4948;

import java.util.*;
public class Main {
	public static boolean[] isPrime = new boolean[246913];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		getPrime();
		
		while(true) {
			int n = sc.nextInt();
			if(n==0) break;
			
			int cnt=0;
			
			for(int i=n+1; i<=2*n; i++) {
				if(!isPrime[i]) cnt++;
			}
			System.out.println(cnt);
		}
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
