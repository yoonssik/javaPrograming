package week13;

public class MethodSample {
	public int getSum(int i, int j) {
		return i + j;
	}

	public int getSum(int i, int j, int k) {
		return i + j + k;
	}

	public double getSum(double i, double j) {
		return i + j;
	}
	public String getSum(double i, int j) {
	return String.valueOf(i+j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   a = new MethodSample();

		int i = a.getSum(1, 2);
		int j = a.getSum(1, 2, 3);
		double k = a.getSum(1.1, 2.2);
		String s = a.getSum(1.1, 2);
	}


}