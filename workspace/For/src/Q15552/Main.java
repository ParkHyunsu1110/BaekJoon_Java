package Q15552;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//입력값을 읽는다.
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	//읽은것을 쓴다.
	
		StringTokenizer st;	//요구사항이 입력받을 때 한줄로 받도록 되어있기 때문, split처럼 사용
		int TC = Integer.parseInt(br.readLine());
		
		for(int i=0; i<TC; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int sum = A + B;
			
			bw.write(sum + "\n");	//콘솔에 나오지는 않음, sum은 int형이지만, \n 를 사용하면서 string으로 바뀐다.
		}
		bw.flush();	//flush() 사용시 한번에 쏟아낸다.
	}

}
