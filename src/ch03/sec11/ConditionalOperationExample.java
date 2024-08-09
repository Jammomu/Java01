package ch03.sec11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
		int score2 = 55;
		String grade2 = (score2 > 60) ? "합격" : "불합격";
		System.out.printf("점수는 %d점이며 최종[%s]입니다.", score2, grade2);

	}

}
