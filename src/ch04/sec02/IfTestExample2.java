package ch04.sec02;

import java.util.Scanner;

public class IfTestExample2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름: ");
		String name = scan.nextLine();
		int money = (int)(Math.random()*10) *1000;
		
		System.out.printf("%s님은 %d에 당첨되셨습니다.", name, money);

	}

}
