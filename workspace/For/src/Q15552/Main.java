package Q15552;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//�Է°��� �д´�.
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	//�������� ����.
	
		StringTokenizer st;	//�䱸������ �Է¹��� �� ���ٷ� �޵��� �Ǿ��ֱ� ����, splitó�� ���
		int TC = Integer.parseInt(br.readLine());
		
		for(int i=0; i<TC; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int sum = A + B;
			
			bw.write(sum + "\n");	//�ֿܼ� �������� ����, sum�� int��������, \n �� ����ϸ鼭 string���� �ٲ��.
		}
		bw.flush();	//flush() ���� �ѹ��� ��Ƴ���.
	}

}
