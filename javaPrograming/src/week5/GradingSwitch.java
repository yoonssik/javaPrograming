package week5;
import java.util.Scanner;
public class GradingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String grade;
		Scanner scanner = new Scanner (System.in);
		System.out.println("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt();//점수읽기
		
		switch(score / 10)/*스코어가 90이상인 경우*/ {
			case 10:
			case 9:
			grade = "A";
			break;
			
			case 8:
			grade = "B";
			break;
			
			case 7:
			grade = "C";
			break;
			
			case 6:
			grade = "D";
			break;
			
			default:
				grade ="F";
		}
		System.out.println("학점은 "+ grade + "입니다.");
		
		scanner.close();
	}
}
