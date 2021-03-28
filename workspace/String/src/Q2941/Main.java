package Q2941;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int count=0;
		for(int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			if(ch == 'c') {
				if(i<word.length()-1) {
					if(word.charAt(i+1) == '=') {
						i++;	//c=
					} else if(word.charAt(i+1)=='-') {
						i++;	//c-
					}
				}
			} else if(ch == 'd') {
				if(i<word.length()-1) {
					if(word.charAt(i+1)=='z') {
						if(i<word.length()-2) {
							if(word.charAt(i+2)=='=') {
								i+=2;	//dz=
							}
						}
					} else if(word.charAt(i+1)=='-') {
						i++;	//d-
					}
				}
			} else if(ch == 'l') {
				if(i<word.length()-1) {
					if(word.charAt(i+1) == 'j') {
						i++;	//lj
					}
				}
			} else if(ch == 'n') {
				if(i<word.length()-1) {
					if(word.charAt(i+1) == 'j') {
						i++;	//nj
					}
				}
			} 
			else if(ch == 's') {
				if(i<word.length()-1) {
					if(word.charAt(i+1)=='=') {
						i++;	//s=
					}
				}
			} 
			else if(ch=='z') {
				if(i<word.length()-1) {
					if(word.charAt(i+1)== '=') {
						i++;
					}
				}
			}
			count++;
		}
		System.out.println(count);
	}
}
