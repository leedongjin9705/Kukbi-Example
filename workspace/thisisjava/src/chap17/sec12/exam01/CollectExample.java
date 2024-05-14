package chap17.sec12.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {

    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("이동진", "남", 92));
        totalList.add(new Student("이동건", "여", 86));
        totalList.add(new Student("이동장", "남", 91));
        totalList.add(new Student("이동빈", "여", 93));

        // 남학생 리스트 추출
        List<Student> maleList = totalList.stream()
                .filter(s -> s.getSex().equals("남"))
                .collect(Collectors.toList());

        maleList.forEach(s -> System.out.println(s.getName()));

        System.out.println();

        // 이름과 점수로 맵 생성
        Map<String, Integer> map = totalList.stream()
                .collect(Collectors.toMap(
                        Student::getName,
                        Student::getScore
                ));

        System.out.println(map);
    }
}
