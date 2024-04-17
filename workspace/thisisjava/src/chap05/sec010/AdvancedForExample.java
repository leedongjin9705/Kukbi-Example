package chap05.sec010;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87}; // 배열 변수 선언
		int sum = 0;
		for(int score : scores) {
			sum += score; // sum = 95 + 71 + 84 + 93 + 87

		}
		System.out.println("점수 총합 : " + sum);
		double avg = (double)sum / scores.length;
		System.out.println("점수 평균 : " + avg);
		
	}

}
