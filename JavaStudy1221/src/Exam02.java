import java.util.Scanner;

public class Exam02 {
	final static double PI=3.141592;

	public static void main(String[] args) {
		System.out.println("구의 겉넓이와 부피를 구합니다.");
		Scanner scan = new Scanner(System.in);
		System.out.print("반지름 : ");
		double radius = scan.nextDouble();
		
		double result = 4*PI*radius*radius;
		System.out.println("겉넓이는 " + result + "입니다.");
		System.out.println("부피는 " + (4/3.0*PI*radius*radius*radius) + "입니다." );
	}
}
