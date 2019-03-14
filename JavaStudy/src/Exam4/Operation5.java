package Exam4;

import java.util.Scanner;

public class Operation5 {
		public static void main(String[] args) {
			boolean isContinue = true;
			int count = 0;
			
			Scanner scan = new Scanner(System.in); 
			while(isContinue) {
				int num1 = (int)(Math.random()*6 + 1);
				int num2 = (int)(Math.random()*6 + 1);
					
				System.out.println("(" + num1+ ", "+ num2 +")");
				//눈 1 + 눈 2 의 형태로 출력할때 쓰임
				if(num1+num2==10) {
					//조건식 
					isContinue = false;
					break;
				}
				count++;
			}	
				System.out.println("주사위를 던진 횟수:" + count);
				
				
				
				
			}
		}


