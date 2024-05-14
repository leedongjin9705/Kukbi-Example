package chap17.sec08;

import java.util.Arrays;

public class LoopingExample {

	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		Arrays.stream(intArr)
		.filter(a -> a%2 ==0)
		.peek(n -> System.out.println(n));
		
		// 중간처리 메소드 peek를 이용해서 반복 처리
		int total = Arrays.stream(intArr)
				.filter(a -> a%2 ==0)
				.peek(n -> System.out.println(n))
				.sum(); // 최종처리
				System.out.print("총합 : " + total +"\n");
				
				Arrays.stream(intArr)
				.filter(a -> a%2==1)
				.forEach(n -> System.out.println(n));
	}

}
