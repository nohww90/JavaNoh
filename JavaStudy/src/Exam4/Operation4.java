package Exam4;

import java.util.Scanner;

public class Operation4 {
		public static void main(String[] args) {
			 boolean isContinue = true; 
			 
			 
			 Scanner scan = new Scanner(System.in); 
			 
			 while(isContinue) { 
				 System.out.println("°¡À§0, ¹ÙÀ§1, º¸2"); 
			     System.out.print("¼ýÀÚ ÀÔ·Â > "); 
			     int player = scan.nextInt(); 
			     int com = (int) (Math.random() * 3); 
			     System.out.println(player + "/" + com); 
			     
			     if(player == com) { 
			    	 System.out.println("ºñ±è"); 
			     } else { 
			    	   if((player + 1) % 3 == com) { 
			    	       System.out.println("Áü"); 
			    	   } else { 
			    		   System.out.println("ÀÌ±è"); 
			    		     isContinue = false;
			    		     
			    		     scan.close(); 
			    	   }
			     }
		}
}
}