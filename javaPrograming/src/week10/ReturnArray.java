package week10;

public class ReturnArray {

	static int[] makeArray() { //정수형 배열을 리턴하는 메소드
		int temp[] = new int[4];
		for (int i = 0; i<temp.length; i++) {
			temp[i] = i; //배열의 원소를 0,1,2,3으로 초기화
		} 
		return temp; //배열 리턴
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[]; //배열 래퍼런스 변수 선언
		intArray = makeArray(); //메소드로부터 배열 전달받음
		for(int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i] + " "); //배열 모든 원소 출력
		}
	}

}
