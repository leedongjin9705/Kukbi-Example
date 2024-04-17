package chap04.sec02;

public class IfElseExample {

	public static void main(String[] args) {
		int score = 85;
		
		if(score >= 90) {
			System.out.println("점수가 90점 이상입니다");
			System.out.println("A등급입니다");
		}
		else {
			System.out.println("점수가 90보다 작습니다");
			System.out.println("B등급입니다");
		}
		
		System.out.println("if 다음 문장 실행");

	}

}
