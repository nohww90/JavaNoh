package Exam4;

import java.util.Scanner;

public class Exam4_3 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in); 
			 System.out.print("정수 3개 입력>>"); 
			  int a = scanner.nextInt(); 
			  int b = scanner.nextInt(); 
			  int c = scanner.nextInt();
			  
			  if(a >= b && a <= c || a >= c && a <= b) {
				  System.out.println("중간값은 a");
			  } else if (b >= a && b <= c || b >= c && b <= a) {
				  System.out.println("중간값은 b");
			  
				  
			  
			  }
		
		}
}
