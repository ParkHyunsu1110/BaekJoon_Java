package Q4673;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean selfNumber[] = new boolean[10001];
		
		for(int i=1; i<selfNumber.length; i++) {
			int n = getDn(i);
			
			if(n<selfNumber.length) selfNumber[n] = true;
		}
		
		for(int i=1; i<selfNumber.length; i++) {
			if(!selfNumber[i]) {
				System.out.println(i);
			}
		}
		
	}

	public static int getDn(int num) {
		int sum = num;
		
		while(num != 0) {
			sum += (num % 10);
			num /= 10;
		}
		
		return sum;
	}
}
