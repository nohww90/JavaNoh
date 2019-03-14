package ch02;

import java.util.Scanner;

public class Input {
		public static void main(String[] args) {
			int age = 100;
		Scanner s = new Scanner(System.in);
		//Scanner 는 참조 자료형이다. -> 값이 정해지지 않는다 
		int num = s.nextInt();
		System.out.println(num);
		
		}
}
