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
				//�� 1 + �� 2 �� ���·� ����Ҷ� ����
				if(num1+num2==10) {
					//���ǽ� 
					isContinue = false;
					break;
				}
				count++;
			}	
				System.out.println("�ֻ����� ���� Ƚ��:" + count);
				
				
				
				
			}
		}


