import java.util.Scanner;

public class Exam09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
				System.out.print("변수 A : ");
				int a = sc.nextInt();
				
				System.out.print("변수 B : ");
				int b = sc.nextInt();
				
				if(a%b != 0) {
					System.out.println("B는 A의 약수가 아닙니다.");
				}else {
					System.out.println("B는 A의 약수입니다.");
				}

	}
	

}
