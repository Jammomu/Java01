package ch04.sec04;

public class MultiplicationTableExample {

	public static void main(String[] args) {
		// 이중 for문을 이용한 구구단 만들기
		for(int m=2; m<=9; m++) {
			System.out.println("*** " + m + "단 ***");
			for(int n=1; n<=9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}

	}

}
