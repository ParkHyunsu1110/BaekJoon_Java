package Q2577;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();	//���� ����
		int Prod = A * B * C;
		int arr[] = new int[10];	//�迭 ����, 0~9 �̹Ƿ� �迭 ũ��� 10
				
		while(Prod > 0) {			//�ݺ��� ����, ��� ���� ���� 0���� Ŀ�� ��.
			arr[Prod % 10]++;		//���� ���� 10���� ���� �������� ���� �ε����� �迭 ���� 1�� �ø�
			Prod /= 10;				//���� ���� 1�� �ڸ� ���� 0�̹Ƿ� 10���� ������
		}
		
		for(int i=0; i<arr.length; i++) {	//�ݺ��� ����, �ݺ� Ƚ���� �迭 ���� ��ŭ
			System.out.println(arr[i]);		//�迭 ���� ��Ÿ����
		}
	}

}
