package Q10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int j=0;
		int arr[] = new int[N];
		for(int i =0; i<N; i++) {
			int num = sc.nextInt();
			if(num < X) {
				arr[j] = num;
				j++;
			}
		}
		for(int i=0; i<j; i++) System.out.print(arr[i] + " ");
	}

}
