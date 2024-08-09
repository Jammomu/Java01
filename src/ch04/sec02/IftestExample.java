package ch04.sec02;

import java.util.Scanner;

public class IftestExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수: ");
		String input = scan.nextLine();
		int num = Integer.parseInt(input);
		// 90 => A, 80 => B
		
		char grade;
		
		if(num>=90) {
			grade = 'A';
		} else if(num>=80) {
			grade = 'B';
		} else {
			grade = 'C';
		}
		
		System.out.println("학점: " + grade);

	}

}
