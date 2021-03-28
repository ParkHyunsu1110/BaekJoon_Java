package Q4344;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int studentCase, cnt, sum;
		double aver;
		int studentScore[] = new int[1000];
		
		for(int i=0; i<testCase; i++) {
			studentCase = sc.nextInt();
			cnt=0; sum=0;
			for(int j=0; j<studentCase; j++) {
				studentScore[j] = sc.nextInt();
				sum += studentScore[j];
			}

			aver=(double)sum/studentCase;
			
			for(int j=0; j<studentCase; j++) {
				if(studentScore[j] > aver) cnt++;
			}

			System.out.printf("%.3f", (cnt / studentCase) * 100.0);
			System.out.println("%");
		}	
	}
}