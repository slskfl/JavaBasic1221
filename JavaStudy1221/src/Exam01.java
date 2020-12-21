import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		System.out.println("삼각형의 넓이를 구합니다.");
		Scanner scan = new Scanner(System.in);
		System.out.print("밑변 : ");
		double weight = scan.nextDouble();
		System.out.print("높이 : ");
		double height = scan.nextDouble();
		
		double result = (weight*height)/2;
		System.out.println("넓이는 " + result + "입니다.");
	}
}
