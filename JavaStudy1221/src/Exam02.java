import java.util.Scanner;

public class Exam02 {
	final static double PI=3.141592;

	public static void main(String[] args) {
		System.out.println("���� �ѳ��̿� ���Ǹ� ���մϴ�.");
		Scanner scan = new Scanner(System.in);
		System.out.print("������ : ");
		double radius = scan.nextDouble();
		
		double result = 4*PI*radius*radius;
		System.out.println("�ѳ��̴� " + result + "�Դϴ�.");
		System.out.println("���Ǵ� " + (4/3.0*PI*radius*radius*radius) + "�Դϴ�." );
	}
}
