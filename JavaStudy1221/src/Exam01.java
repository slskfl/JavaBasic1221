import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		System.out.println("�ﰢ���� ���̸� ���մϴ�.");
		Scanner scan = new Scanner(System.in);
		System.out.print("�غ� : ");
		double weight = scan.nextDouble();
		System.out.print("���� : ");
		double height = scan.nextDouble();
		
		double result = (weight*height)/2;
		System.out.println("���̴� " + result + "�Դϴ�.");
	}
}
