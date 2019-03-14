package Exam4;

public class RightStar {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			int space = 5 - i;

			for (int j = 1; j <= 5; j++) {
				if (j <= space) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
				System.out.println();

			}
		}
	}

