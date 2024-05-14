package chap17.sec12.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import chap17.sec12.exam01.Student;

public class CollectExample {

	public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("이동진", "남", 92));
        totalList.add(new Student("이동건", "여", 86));
        totalList.add(new Student("이동장", "남", 91));
        totalList.add(new Student("이동빈", "여", 93));

        // 스트림 연산을 main 메서드 안에 배치
        Map<String, List<Student>> map = totalList.stream()
                .collect(
                        Collectors.groupingBy(Student::getSex) // 메서드 참조 수정
                );
        
        List<Student> maleList = map.get("남");
        maleList.stream().forEach(s->System.out.println(s.getName()));
        System.out.println();
        
        List<Student> femaleList = map.get("여");
        femaleList.stream().forEach(s-> System.out.println(s.getName()));
}
}