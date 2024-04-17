package chap05.sec12;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		Week today = null;// week 열거 타입 변수 선언
		Calendar cal = Calendar.getInstance(); //Calendar 열기
		
		int week = cal.get(Calendar.DAY_OF_WEEK); // 오늘의 요일 얻기(1~7)
		
		switch(week) {
		case 1: today = Week.SUNDAY;break;	
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUSEDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		}
		System.out.println("today : " + today);
		//열거 타입 변수 사용
		if(today == Week.MONDAY) {
			System.out.println("일요일에는 축구를 합니다");
		} else {
			System.out.println("자바 공부를 합니다");
		}

	}

}
