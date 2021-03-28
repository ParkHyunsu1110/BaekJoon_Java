package Q1152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine().trim();
		if(sentence.isEmpty()) System.out.println(0);
		else System.out.println(sentence.split(" ").length);
	}
}
