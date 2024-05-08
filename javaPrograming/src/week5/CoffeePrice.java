package week5;
import java.util.Scanner;
public class CoffeePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
				
				System.out.println("무슨 커피 드릴까여?");
				String order = scanner.next();
				int price = 0;
				switch (order) {
				case "에스프레소":
				case "카푸치노":
				case "카페라떼":
				price = 3500;
				break;
				
				case "아메리카노":
				price = 2000;
				break;
				
				default :
			
				System.out.println(" 말씀하신 메뉴는 없으니 다른 매장으로 꺼져주세욤.");

			
				}
				if(price != 0)
					System.out.println(order = order + "는 " + price + "원 입니다.");
				scanner.close();
	}

}
