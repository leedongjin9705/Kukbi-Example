package chap12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperationExample {

	public static void main(String[] args) {
		// LocalDateTime : 날짜와 시간을 조작하는 클래스
		LocalDateTime now = LocalDateTime.now(); // 현재 컵퓨터의 날짜와 시간 얻음
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		// 날짜와 시간을 주어진 문자열 패턴으로 변환할 때 사용함
		System.out.println("현재 시간: " + now.format(dtf));
		// format 메서드 호출시 DateTimeFormatter.ofPattern을 매개값으로 제공하면
		// 문자열 패턴과 동일한 문자열을 얻음
		LocalDateTime result1 = now.plusYears(1);
		// plusYear : 년 더하기
		System.out.println("1년 덧셈: " + result1.format(dtf));
		LocalDateTime result2 = now.minusMonths(2);
		System.out.println("2달 뺄셈: " + result2.format(dtf));
		LocalDateTime result3 = now.plusDays(7);
		System.out.println("7일 덧셈: " + result3.format(dtf));
	}

}
