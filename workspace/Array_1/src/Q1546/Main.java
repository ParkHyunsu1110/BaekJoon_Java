package Q1546;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double arr[] = new double[N];
		
		for(int i=0; i<arr.length; i++) arr[i] = sc.nextInt();

		double max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) max = arr[i];
		}
		for(int i=0; i<arr.length; i++)  arr[i] = arr[i] / max * 100;
		double sum = 0;
		for(int i=0; i<arr.length; i++) sum += arr[i];
		
		double aver = sum / arr.length;
		System.out.println(aver);
	}

}
