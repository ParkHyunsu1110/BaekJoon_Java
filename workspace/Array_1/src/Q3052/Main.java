package Q3052;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int arr[] = new int[42];
		for(int i=0; i<10; i++) {
			num = sc.nextInt();
			arr[num%42]++;
		}
		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > 0) j++;
		}
		System.out.println(j);
	}

}
