import java.util.Random;
import java.util.Scanner;

public class Exam03 {
		public static void main(String[] args) {
		System.out.println("3���� ������ �����մϴ�.");
		Random rand = new Random();
		int num1 = 1 + rand.nextInt(9); //1~9
		int num2 = (-1) * rand.nextInt(9) +1;//-1~-9
		int num3 = 10 + rand.nextInt(90);//1~89
		System.out.println("3���� ������ �����߽��ϴ�.");
		System.out.println("�� �ڸ� ���� ���� : " + num1);
		System.out.println("�� �ڸ� ���� ���� : " + num2);
		System.out.println("�� �ڸ� ���� ���� : " + num3);

		
	}
}
