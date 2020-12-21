import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정숫값 : ");
				int num = sc.nextInt();
		if(num>=0) {
				System.out.println("절댓값은 "+ num +"입니다.");
		}else {
				System.out.println("절댓값은 "+ -num +"입니다.");
				}


	}

}
