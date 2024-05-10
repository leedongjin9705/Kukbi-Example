package chap17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("이동진", 10),
				new Student("이동순", 20),
				new Student("이동건", 30)
				);
		
		/*
		//방법 1
		Stream<Student> studentStream = list.stream();
		//Student 객체를 점수로 매핑
		IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
		// mapToInt() 메소드 : 객체를 INT 값으로 매핑해서 IntStream으로 변환
		double avg = scoreStream.average().getAsDouble(); 
		*/
		
		// 방법 2 (메소드 체이닝 패턴)
		double avg = list.stream()
				.mapToInt(student -> student.getScore())
				.average()
				.getAsDouble();
		System.out.println("평균점수: " + avg);

	}

}
