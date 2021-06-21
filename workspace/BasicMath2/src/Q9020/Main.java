package Q9020;

import java.util.*;
public class Main {
	public static boolean[] isPrime = new boolean[10001];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		getPrime();
		int T = sc.nextInt();
		while(T --> 0) {
			int n = sc.nextInt();
			int first_Partition = n/2;
			int second_Partition = n/2;
			
			while(true) {
				if(!isPrime[first_Partition] && !isPrime[second_Partition]) {
					System.out.println(first_Partition + " " + second_Partition);
					break;
				}
				first_Partition--;
				second_Partition++;
			}
		}
	}
	public static void getPrime() {
		isPrime[0] = isPrime[1] = true;
		
		for(int i=2; i<Math.sqrt(isPrime.length); i++) {
			if(isPrime[i]) continue;
			for(int j = i*i; j<isPrime.length; j += i) {
				isPrime[j] = true;
			}
		}
	}
}
