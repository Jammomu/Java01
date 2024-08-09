package ch04.sec04;

public class MultiplicationTableExample2 {

	public static void main(String[] args) {
		// for문 하나만 쓰고 구구단 만들기
		for(int i=0; i< 64; i++) {
			int dan = (i/8) + 2;
			int n = (i%8) + 2;
			System.out.printf("%d * %d = %d\n", dan, n, dan*n);
		}

	}

}
