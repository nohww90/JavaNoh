package ch05;

public class IfTest {
	public static void main(String[] args) {
		int score = 87;
		if (score >= 90) {
			System.out.println("A");
		} else if (score< 90 && score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
