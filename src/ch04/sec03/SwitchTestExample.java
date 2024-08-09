package ch04.sec03;

import java.util.Scanner;

public class SwitchTestExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("점수: ");
		String input = scan.nextLine();
		int num = Integer.parseInt(input);
		
		
		switch(num/10) {
		case 9:
			System.out.println("학점: A");
			break;
		case 8:
			System.out.println("학점: B");
			break;
		case 7:
			System.out.println("학점: C");
			break;
		case 6:
			System.out.println("학점: D");
			break;
		default:
			System.out.println("과락입니다.");
			break;
		}

	}

}
