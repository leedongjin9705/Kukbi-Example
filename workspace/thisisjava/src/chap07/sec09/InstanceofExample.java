package chap07.sec09;

public class InstanceofExample {
	//main()메소드에서 바로 호출하기 위해 정적 메소드 선언
	public static void PersonInfo(Person person) {
		System.out.println("name : " + person.name);
		person.walk();
	
	
	if(person instanceof Student student) {
		System.out.println("studentNo : " + student.studentNo);
		student.study();
	}
	/* instanceof:
	 *  person이 참조하는 객체가 Student 타입인지 확인함
	 *  Student 객체만 가지고 있는 필드및 메소드를 사용
	 * */
}
	public static void main(String[] args) {
		// perdon 객체를 매개값으로 제공하고 instanceof() 메소드 제공
		Person p1 = new Person("이동진");
		PersonInfo(p1);
		System.out.println();
		
		// Student 객체를 매개값으로 제공하고 PersonInof() 메소드 제공
		Person p2 = new Student("이동진", 30);
		PersonInfo(p2);
		
		

	}

}
