package Exam4;

import java.util.Scanner;

public class Exam4_3 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in); 
			 System.out.print("���� 3�� �Է�>>"); 
			  int a = scanner.nextInt(); 
			  int b = scanner.nextInt(); 
			  int c = scanner.nextInt();
			  
			  if(a >= b && a <= c || a >= c && a <= b) {
				  System.out.println("�߰����� a");
			  } else if (b >= a && b <= c || b >= c && b <= a) {
				  System.out.println("�߰����� b");
			  
				  
			  
			  }
		
		}
}
