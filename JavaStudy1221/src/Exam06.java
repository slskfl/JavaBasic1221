import java.util.Random;
import java.util.Scanner;

public class Exam06 {
		public static void main(String[] args) {
			Random rand = new Random();
			double num1 = rand.nextDouble();
			double num2 = rand.nextDouble()*10;
			double num3 = -1 + 2 * rand.nextDouble(); //0~1.99998
			System.out.println("3���� ������ �����߽��ϴ�.");
			System.out.println("0.0 �̻� 1.0�̸� : " + num1);
			System.out.println("0.0 �̻� 10.0�̸� : " + num2);
			System.out.println("-1.0 �̻� 1.0�̸� : " + num3);
		
	}
}
