package week8;
import java.util.Scanner;
public class CountinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in)
				
		System.out.println("쩡수를 5개 입력하시오.");
		int sum = 0;
				for(int i = 0; i < 5; i++) {
					int n = scanner.nextInt();
					if(n <= 0)
						continue;
					else
						sum  += n;
				}
		System.out.println("양수의 합은?" + sum);
		
		scanner.close();
	}

}
