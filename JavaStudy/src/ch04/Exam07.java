package ch04;

public class Exam07 {
		public static void main(String[] args) {
			
			int num = 12345;
			
			int n1 = num % 10;
			

			num = num / 10;
			int n2 = num % 10;
			
			num = num / 10;
			int n3 = num % 10;
					
			num = num / 10;
			int n4 = num % 10;
			
			num = num / 10;
			int n5 = num % 10;
			
			int total = n1 + n2 + n3 + n4 + n5;
			System.out.println("각 자리 숫자의 합:" + total);
			
			
			
		}
		
		
}
