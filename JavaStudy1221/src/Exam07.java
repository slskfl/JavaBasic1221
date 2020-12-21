import java.util.Random;
import java.util.Scanner;

public class Exam07 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("성 이름 : ");
			String lastName = sc.next();	//성
			String firstName = sc.next();	//이름
			System.out.println("성 : " + lastName);
			System.out.println("이름 : " + firstName);
					
			System.out.println("안녕하세요. " + lastName + firstName +"씨");

	}
}
