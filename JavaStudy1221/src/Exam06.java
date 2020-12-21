import java.util.Random;
import java.util.Scanner;

public class Exam06 {
		public static void main(String[] args) {
			Random rand = new Random();
			double num1 = rand.nextDouble();
			double num2 = rand.nextDouble()*10;
			double num3 = -1 + 2 * rand.nextDouble(); //0~1.99998
			System.out.println("3개의 난수를 생성했습니다.");
			System.out.println("0.0 이상 1.0미만 : " + num1);
			System.out.println("0.0 이상 10.0미만 : " + num2);
			System.out.println("-1.0 이상 1.0미만 : " + num3);
		
	}
}
