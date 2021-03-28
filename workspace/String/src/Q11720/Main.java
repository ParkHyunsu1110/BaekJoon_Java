package Q11720;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String number = sc.next();
		int sum=0;
		String stringArr[] = number.split("");
		int intArr[] = new int[stringArr.length];
		for(int i=0; i<number.length(); i++) {
			intArr[i] = Integer.parseInt(stringArr[i]);
			sum += intArr[i];
		}
		System.out.println(sum);
	}
}
