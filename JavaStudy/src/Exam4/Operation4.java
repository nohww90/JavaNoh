package Exam4;

import java.util.Scanner;

public class Operation4 {
		public static void main(String[] args) {
			 boolean isContinue = true; 
			 
			 
			 Scanner scan = new Scanner(System.in); 
			 
			 while(isContinue) { 
				 System.out.println("����0, ����1, ��2"); 
			     System.out.print("���� �Է� > "); 
			     int player = scan.nextInt(); 
			     int com = (int) (Math.random() * 3); 
			     System.out.println(player + "/" + com); 
			     
			     if(player == com) { 
			    	 System.out.println("���"); 
			     } else { 
			    	   if((player + 1) % 3 == com) { 
			    	       System.out.println("��"); 
			    	   } else { 
			    		   System.out.println("�̱�"); 
			    		     isContinue = false;
			    		     
			    		     scan.close(); 
			    	   }
			     }
		}
}
}