package Q10818;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i=0; i<arr.length; i++) {
			int x = sc.nextInt();
			arr[i] = x;
		}
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[arr.length-1]);
	}

}
