package chap12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		
		LocalDateTime startDateTime = LocalDateTime.of(2023, 11, 28, 12, 30, 0);
		System.out.println("시작일: " + startDateTime.format(dtf));
		LocalDateTime endDateTime = LocalDateTime.of(2025, 12, 31, 12, 30, 0);
		System.out.println("종료일: " + endDateTime.format(dtf));
		
		if(startDateTime.isBefore(endDateTime)) { // 이전 날짜인지 판별
			System.out.println("진행중입니다");			
		} else if(startDateTime.isEqual(endDateTime)) { // 동일 날짜인지 판별
			System.out.println("해당 일, 시간입니다");
		} else if(startDateTime.isAfter(endDateTime)) { // 이후 날짜인지 판별
			System.out.println("종료됐습니다");
		}
		// ChronoUnit 클래스 : 표준 날짜 기간 단위 집합
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);		
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinutes = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSeconds = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		System.out.println("남은 해: " + remainYear);
		System.out.println("남은 달: " + remainMonth);
		System.out.println("남은 일: " + remainDay);
		System.out.println("남은 시간: " + remainHour);
		System.out.println("남은 분: " + remainMinutes);
		System.out.println("남은 초: " + remainSeconds);
	}
}
