package week5;
import java.util.Scanner;
public class Granding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String grade;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt();//점수읽기
		if(score >= 90 )//스코어가 90이상인 경우//
			grade = "A";
		else if(score >= 80 )//스코어가 80이상 90미만인 경우
			grade = "B";
		else if(score >= 70 )//스코어가 70이상 80미만인 경우
			grade = "C";
		else if(score >= 60 )//스코어가 60이상 70미만인 경우
			grade = "D";
		else //스코어 60미만인 경우
			grade = "F";
		System.out.println("학점은 "+ grade + "입니다.");
		
		scanner.close();
	}

}
