package ch05;

public class If {
	public static void main(String[] args) {
		
		int score = 87; 
		if(score >= 60) { 
			if (score >= 70) {
			
			}
			System.out.println("D");
		   System.out.println("A"); 
		} else if(score >= 80) {       // ������ 80 ���� ũ�ų� ���ų� 
			 System.out.println("B"); 
		} else if(score >= 70) {        // ������ 70���� ũ�ų� ���ų�
			 System.out.println("C"); 
		} else if(score >= 60) {       // ������ 60 ���� ũ�ų� ���ų� 
			System.out.println("D"); 
		} else { 
			 System.out.println("F"); 
			 
		}
	}
}
