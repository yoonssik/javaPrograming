package week13;
		
class Circles {
	int radius;

	public Circles(int radius) {
		this.radius = radius;
	}
}

public class ReferencePassing {
	
	public static void main(String args[]) {
		Circles pizza = new Circles(10);
		
		increase(pizza);
	
		System.out.println(pizza.radius);
	}
	static void increase(Circles m) {
		m.radius++;
	}
}
