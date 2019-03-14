package ch05;

public class If {
	public static void main(String[] args) {
		
		int score = 87; 
		if(score >= 60) { 
			if (score >= 70) {
			
			}
			System.out.println("D");
		   System.out.println("A"); 
		} else if(score >= 80) {       // 점수가 80 보다 크거나 같거나 
			 System.out.println("B"); 
		} else if(score >= 70) {        // 점수가 70보다 크거나 같거나
			 System.out.println("C"); 
		} else if(score >= 60) {       // 점수가 60 보다 크거나 같거나 
			System.out.println("D"); 
		} else { 
			 System.out.println("F"); 
			 
		}
	}
}
