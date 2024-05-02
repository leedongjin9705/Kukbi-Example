package chap15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// Set 컬렉션은 저장 순서가 유지되지 않음
		// Set 컬렉션은 중복 저장할 수 없음
		//HashSet 생성
		Set<String> set = new HashSet<>();
		
		// 객체 저장 : add()
		set.add("java");
		set.add("JDBC");
		set.add("Setvlet/jsp");
		set.add("java");       // 중복 객체  (저장 x)
		set.add("iBATIES");
		
		// 저장된 객체 수 출력
		int size = set.size();
		System.out.println(size);
		
		

	}

}
