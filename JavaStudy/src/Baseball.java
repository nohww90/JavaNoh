import java.util.Scanner;

public class Baseball {
		public static void main(String[] args) {
			Number n = new Number();
			int number = n.get();
			
			int baseball3 = number % 10;
			int baseball2 = (number / 10) % 10;
			int baseball1 = (number / 10 / 10 ) % 10;
			
			Scanner s = new Scanner(System.in);
			int inputNumber1 = s.nextInt();
			int inputNumber2 = s.nextInt();
			int inputNumber3 = s.nextInt();
			
			
			int strike = 0;
			int ball = 0;
		}
}
