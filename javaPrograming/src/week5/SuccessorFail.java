package week5;

import java.util.Scanner;

public class SuccessorFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하시오.");
		int score =scanner.nextInt();
		if (score >= 80) {
			System.out.println("축하합니다 합격입니다.");
		}
		scanner.close();
	}

}
