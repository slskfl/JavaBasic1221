import java.util.Random;
import java.util.Scanner;

public class Exam03 {
		public static void main(String[] args) {
		System.out.println("3개의 난수를 생성합니다.");
		Random rand = new Random();
		int num1 = 1 + rand.nextInt(9); //1~9
		int num2 = (-1) * rand.nextInt(9) +1;//-1~-9
		int num3 = 10 + rand.nextInt(90);//1~89
		System.out.println("3개의 난수를 생성했습니다.");
		System.out.println("한 자리 양의 정수 : " + num1);
		System.out.println("한 자리 음의 정수 : " + num2);
		System.out.println("두 자리 양의 정수 : " + num3);

		
	}
}
