package chap17.sec02;

import java.util.*;
import java.util.stream.Stream;

public class ParallelStreamExample {

	public static void main(String[] args) {
		// List 컬렉션 생성
		List<String> list = new ArrayList<>();
		list.add("이동진");
		list.add("이동건");
		list.add("이동준");
		list.add("이동연");
		list.add("이동부");
		
		// 병렬 처리
		Stream<String> parallelStream = list.parallelStream();
		// 병렬 스트림 얻기(parallelStream())
		parallelStream.forEach(name -> {
			System.out.println(name + ":" + Thread.currentThread().getName());	
												// 어떤 쓰레드가 처리하는지 출력
		});
				

	}

}
