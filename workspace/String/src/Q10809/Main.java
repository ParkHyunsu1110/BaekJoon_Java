package Q10809;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[26];
		for(int i=0; i<arr.length; i++) arr[i] = -1;
		
		String word = sc.next();
		for(int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			if(arr[ch - 'a'] == -1) arr[ch - 'a'] = i;
		}
		for(int val : arr) System.out.print(val + " ");
	}
}
