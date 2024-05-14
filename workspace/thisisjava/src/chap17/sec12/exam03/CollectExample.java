package chap17.sec12.exam03;

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
        
        Map<String, Double> map = totalList.stream()
        		.collect(
        				Collectors.groupingBy(
        						s -> s.getSex(),
        						Collectors.averagingDouble(s->s.getScore())
        						)
        				);
        
        System.out.println(map);

	}

}
