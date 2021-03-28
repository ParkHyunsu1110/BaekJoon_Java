package Q1316;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = sc.nextInt();
		int count=0;
		for(int i=0; i<N; i++) {
			if(check() == true) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static boolean check() {
		boolean check[] = new boolean[26];
		int prev=0;	//이전 단어의 ASCII값 저장
		String str = sc.next();
		
		for(int i=0; i<str.length(); i++) {
			int now = str.charAt(i);
			
			if(prev != now) {
				if(check[now - 'a'] == false) {	//boolean 배열의 경우 기본 값이 false
					check[now - 'a'] = true;
					prev = now;
				}
				else {
					return false;
				}
			}
			else {
				continue;
			}	
		}
		return true;
	}
}
