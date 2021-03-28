package Q1157;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[26];
		String word = sc.next();
		
		for(int i=0; i<word.length(); i++) {	//단어의 알파벳 검사
			if(word.charAt(i)>=65 && word.charAt(i)<=90) {	//대문자의 경우
				arr[word.charAt(i)-65]++;
			}
			else {
				arr[word.charAt(i) - 97]++;
			}
		}
		
		int max = -1;
		char ch = '?';
		
		for(int i=0; i<26; i++) {
			if(arr[i]>max) {
				max = arr[i]; ch = (char) (i + 65);
			}else if(arr[i] == max){
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}
