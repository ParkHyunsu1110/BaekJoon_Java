package Q2588;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int o = 1, t = 10, h = 100;
		System.out.println( a*(b%t));
		System.out.println(a*((b%h)/t));
		System.out.println(a*(b/h));
		System.out.println(a*b);
	}
}
