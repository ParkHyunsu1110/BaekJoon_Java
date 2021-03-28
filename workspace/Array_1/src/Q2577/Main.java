package Q2577;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();	//변수 정의
		int Prod = A * B * C;
		int arr[] = new int[10];	//배열 정의, 0~9 이므로 배열 크기는 10
				
		while(Prod > 0) {			//반복문 생성, 모두 곱한 수가 0보다 커야 함.
			arr[Prod % 10]++;		//곱한 수를 10으로 나눈 나머지의 베열 인덱스의 배열 값을 1씩 올림
			Prod /= 10;				//곰한 수의 1의 자리 수가 0이므로 10으로 나눠줌
		}
		
		for(int i=0; i<arr.length; i++) {	//반복문 생성, 반복 횟수는 배열 길이 만큼
			System.out.println(arr[i]);		//배열 값을 나타내줌
		}
	}

}
