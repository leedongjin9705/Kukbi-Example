package chap04.sec02;

public class IfElseElseExample {

	public static void main(String[] args) {
		int score = 50;
		
		if(score >= 90) {
			System.out.println("점수가 90 ~ 100점 사이입니다");
			System.out.println("A등급입니다");			
		} else if(score >= 80) {
			System.out.println("점수가 80 ~ 89점 사이입니다");
			System.out.println("B등급입니다");	
		} else if(score >= 70) {
			System.out.println("점수가 70 ~ 79점 사이입니다");
			System.out.println("C등급입니다");				
		} else if(score >= 60) {
			System.out.println("점수가 60 ~ 69점 사이입니다");
			System.out.println("D등급입니다");				
		} else if(score >= 50) {
			System.out.println("점수가 60 미만입니다");
			System.out.println("F등급입니다");				
		}
		
		System.out.println("if 다음 문장 실행");
			
		

	}

}
