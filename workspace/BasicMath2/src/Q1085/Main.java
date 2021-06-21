package Q1085;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt();
		int w = sc.nextInt(), h = sc.nextInt();

		System.out.println(Math.min(Math.min(w-x, x), Math.min(h-y, y)));
	}
}
