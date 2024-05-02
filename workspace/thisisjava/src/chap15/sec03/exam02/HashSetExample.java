package chap15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// HashSetExample
		Set<Member> set = new HashSet<>();
		
		// Member 객체 저장 : add() 사용
		set.add(new Member("이동진", 28));
		set.add(new Member("이동순", 28));
		set.add(new Member("이동진", 28)); // 동등 객체이므로 저장 x
		
		// 저장된 객체 수 출력
		System.out.println("총 객체 수 : " + set.size());

	}

}
