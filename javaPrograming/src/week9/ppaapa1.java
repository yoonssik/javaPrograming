package week9;

public class ppaapa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 1;
		while(i<100) {
			if(i%3 !=0) {
				i++;
				continue;
			}
			else sum +=1;
			i++;
		}
	}

}
